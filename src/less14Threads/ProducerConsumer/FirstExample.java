package less14Threads.ProducerConsumer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static less14Threads.ProducerConsumer.FirstExample.list;

/**
 * Created by Tom on 04.12.2017.
 */
public class FirstExample {
    public static List<Integer> list = Collections.synchronizedList(new LinkedList<>());

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        consumer.start();
        producer.start();
    }
}

class Producer extends Thread {
    final static int MIN = 1;
    final static int MAX = 10;

    @Override
    public void run() {
        while (list.isEmpty()) {
            synchronized (list) {
                int randomNumber = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
                list.add(randomNumber);
                System.out.println("ADDED" + randomNumber + "первый эл в кол " + list.get(0));
                list.notify();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.remove(0);
                System.out.println("KKKKKKKKKKKKKKK");
            }
        }
    }
}

