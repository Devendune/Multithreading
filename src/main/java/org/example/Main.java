package org.example;

import ProduceConsume.ConsumeTask;
import ProduceConsume.ProduceTask;
import ProduceConsume.SharedResource;

public class Main
{
    public static void main(String[] args)
    {
        MultiThreadingLearning obj=new MultiThreadingLearning();
        Thread threadClass=new Thread(obj);
        //threadClass.start();

        MultiThreadingClass mtc=new MultiThreadingClass();
        //mtc.run();

        MonitorLockingExample objMonitor=new MonitorLockingExample();
        MonitorLockingCall1 objCall1=new MonitorLockingCall1(objMonitor);
        MonitorLockingCall2 objCall2=new MonitorLockingCall2(objMonitor);

        Thread t1=new Thread(objCall1);
        Thread t2=new Thread(objCall2);



        //I am passing runnable which is a functional interface having only one abstract method run accepting n
        //no parameters
//        Thread t1=new Thread(());
//        Thread t2=new Thread(()->{obj.task2();});
//        Thread t3=new Thread(()->{obj.task3();});

        SharedResource sharedResource=new SharedResource();
        Thread producerThread=new Thread(new ProduceTask(sharedResource));
        Thread consumerThread=new Thread(new ConsumeTask(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}