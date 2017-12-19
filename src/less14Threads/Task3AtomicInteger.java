package less14Threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Tom on 04.12.2017.
 */
public class Task3AtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000; i++) {
                    atomicInteger.getAndIncrement();

                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000; i++) {
                atomicInteger.getAndIncrement();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(atomicInteger);
    }


}