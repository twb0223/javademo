package com.twb.oauth.nettycommon;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 200,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i);
            threadPoolExecutor.execute(myTask);
            System.out.println("线程池中线程数目：" + threadPoolExecutor.getPoolSize() + "，队列中等待执行的任务数目：" +
                    threadPoolExecutor.getQueue().size() + "，已执行的任务数目：" + threadPoolExecutor.getCompletedTaskCount());
        }
        threadPoolExecutor.shutdown();
    }
}


class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行：" + taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(taskNum + " END");
    }
}


//单例模式 --
class EnumSingleton {

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        INSTANCE;
        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        private Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }
}

//懒汉模式
class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }
}
//线程安全的懒汉模式
class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {

    }
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null){
            instance=new SingletonDemo2();
        }
        return instance;
    }
}

//饿汉模式

class SingletonDemo3{
    private static SingletonDemo3 instance=new SingletonDemo3();
    private SingletonDemo3(){

    }
    public static SingletonDemo3 getInstance(){
        return instance;
    }
}