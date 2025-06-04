package ReiterantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main
{
    public static void main(String[] args)
    {
        ReentrantLock lock=new ReentrantLock();

        SharedResource sharedResource1=new SharedResource();

        Thread t1=new Thread(new FirstClass(sharedResource1,lock));

        SharedResource sharedResource2=new SharedResource();

        Thread t2=new Thread(new FirstClass(sharedResource2,lock));

        t1.start();
        t2.start();
    }

}
