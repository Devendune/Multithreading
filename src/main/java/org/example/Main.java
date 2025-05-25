package org.example;

public class Main
{
    public static void main(String[] args)
    {
        MultiThreadingLearning obj=new MultiThreadingLearning();
        Thread threadClass=new Thread(obj);
        //threadClass.start();


        MultiThreadingClass mtc=new MultiThreadingClass();
        mtc.run();
    }
}