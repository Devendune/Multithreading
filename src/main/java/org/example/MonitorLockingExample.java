package org.example;

public class MonitorLockingExample
{
    public synchronized void task1()
    {
        try
        {
            System.out.println("Inside task1");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void task2()
    {
        System.out.println("Task2, but before synchronization");
        synchronized (this)
        {
            System.out.println("Task2,inside synchronization");
        }
    }

    public void task3()
    {
        System.out.println("This is task3 method");
    }

}
