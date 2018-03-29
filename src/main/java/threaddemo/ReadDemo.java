package threaddemo;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadDemo extends ReentrantReadWriteLock {
    public void read() {
        try {
            readLock().lock();
            System.out.println(Thread.currentThread().getName() + "get readlock,time is:" + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            readLock().unlock();
        }
    }

    public static void main(String[] args) {
        final ReadDemo td = new ReadDemo();
        Runnable runnable = () -> td.read();
        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread0.start();
        thread1.start();
    }
}
