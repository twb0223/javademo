package ThreadDemo;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteDemo extends ReentrantReadWriteLock {
    public void write() {
        try {
            writeLock().lock();
            System.out.println(Thread.currentThread().getName() + "get writeLock,time is:" + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writeLock().unlock();
        }

    }

    public static void main(String[] args) {
        final WriteDemo wd = new WriteDemo();
        Runnable runnable = () -> wd.write();

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread0.start();
        thread1.start();

    }
}

