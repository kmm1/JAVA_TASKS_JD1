package less14Threads.ProducerConsumer;

//есть склад, на который производители добавляют товары, а потребители берут товары.
// Потребитель может взять товар только при его наличии на складе,
// то есть когда производитель его добавил.

public class SecondExample {

    public static void main(String[] args) {

        Store store = new Store();
        Producer2 producer2 = new Producer2(store);
        Consumer2 consumer2 = new Consumer2(store);
        new Thread(producer2).start();
        new Thread(consumer2).start();
    }
}

// Класс Магазин, хранящий произведенные товары
class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
       // System.out.println("Товаров на складе: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        //System.out.println("Товаров на складе: " + product);
        notify();
    }
}

// класс Производитель
class Producer2 implements Runnable {

    Store store;

    Producer2(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}

// Класс Потребитель
class Consumer2 implements Runnable {

    Store store;

    Consumer2(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}