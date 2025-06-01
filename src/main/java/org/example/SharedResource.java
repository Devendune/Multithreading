package org.example;

public class SharedResource
{
    boolean itemAvailable=false;
    public synchronized  void addItem()
    {
        itemAvailable=true;
        System.out.println("Item added by: "+Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem()
    {
        System.out.println("ConsumeItem is invoked by: "+Thread.currentThread().getName());

        while(!itemAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + "is waiting now");
                wait();
            } catch (Exception e) {

            }
            //handle exception
        }
        System.out.println("Consumed by "+Thread.currentThread().getName());
        itemAvailable=false;
    }
}
