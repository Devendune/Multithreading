package ReiterantLock;

import java.util.concurrent.locks.ReentrantLock;

public class FirstClass implements Runnable
{
    SharedResource sharedResource;
    ReentrantLock lock;

    FirstClass(SharedResource sharedResource,ReentrantLock lock)
    {
        this.sharedResource=sharedResource;
        this.lock=lock;
    }

    @Override
    public void run()
    {
        sharedResource.producer(lock);
    }


}
