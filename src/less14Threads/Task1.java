package less14Threads;

//1 Создать трэд с помощью наследника от класса Thread.
// В этом классе должен происходить вывод в консоль "Привет из другого трэда".
//2 Повторить предыдущее упражнение при помощи интерфейса Runnable;
public class Task1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello im your new thread!!");
            }
        });

        Thread thread = new Thread(() -> System.out.println("helloooo!!"));
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
//do smth
    }
}
