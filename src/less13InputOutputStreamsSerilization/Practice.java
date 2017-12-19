package less13InputOutputStreamsSerilization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Tom on 19.12.2017.
 */
public class Practice {
    public static List<String> list = Collections.synchronizedList(new ArrayList<>());
    public static Lock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();


    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
    }

    static class MyThread1 extends Thread {
        Scanner scanner = new Scanner(System.in);

        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " working");
            try {
                Thread.sleep(111);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();

        }
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                if (lock.tryLock()) {
                    System.out.println(getName() + " получилось");
                    break;
                } else System.out.println(getName() + " NO");

            }
        }
    }
}