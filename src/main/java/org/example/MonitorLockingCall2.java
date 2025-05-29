package org.example;

public class MonitorLockingCall2 implements Runnable {
    public MonitorLockingExample monitorLockingExample;

    public MonitorLockingCall2(MonitorLockingExample monitorLockingExample) {
        this.monitorLockingExample = monitorLockingExample;
    }

    @Override
    public void run() {
        monitorLockingExample.task2();
    }
}
