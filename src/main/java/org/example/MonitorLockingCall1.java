package org.example;

public class MonitorLockingCall1 implements Runnable
{
    public MonitorLockingExample monitorLockingExample;

    public MonitorLockingCall1(MonitorLockingExample monitorLockingExample)
    {
        this.monitorLockingExample=monitorLockingExample;
    }

    @Override
    public void run()
    {
        monitorLockingExample.task1();
    }
}
