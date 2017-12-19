package less14Threads;

/**
 * Created by Tom on 19.12.2017.
 */
public class DeadLock { // может возникнуть deadLock а может и нет
    static int c1 = 0;
    static int c2 = 0;
    static Object LOCK1 = new Object();
    static Object LOCK2 = new Object();

    public static void c1c2UP() {
        synchronized (LOCK1) {
            // Thread.sleep(2);

            c1++;
            synchronized (LOCK2) {
                c2++;
            }
        }
    }

    public static void c2c1UP() {
        synchronized (LOCK2) {
            c2++;
            synchronized (LOCK1) {
                c1++;
            }
        }
    }

    public static void main(String[] str) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

    }

    static class MyThread1 extends Thread {
        @Override
        public void run() {
            c1c2UP();
        }
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {
            c2c1UP();
        }
    }
}


