package less14Threads;


//создать побочный тред печатающий на консоль "привет из треда 1"
// и создающий тред печатающий тред "привет из треда 2" и создающий тред ... и так до треда 50
//печать должна происходить в обратном порядке
//      "привет из треда 50"
//      "привет из треда 49"
//       ...
//      "привет из треда 1"

class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        for (int i = NewThread.getMAX(); i > 0; i--) {
            NewThread newThread = new NewThread(i, lock);
            newThread.start();
        }
    }
}

class NewThread extends Thread {
    private int threadId;
    private static int max = 10;
    final Object lock;

    public static int getMAX() {
        return max;
    }

    public NewThread(int threadId, Object lock) {
        this.threadId = threadId;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (threadId < max) {
                    lock.wait();
                }
                max--;
                System.out.println("thread number " + threadId);
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
