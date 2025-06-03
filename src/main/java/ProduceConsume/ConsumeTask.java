package ProduceConsume;

public class ConsumeTask implements Runnable
{
    public ConsumeTask(SharedResource sharedResource)
    {
        this.sharedResource=sharedResource;
    }

    SharedResource sharedResource;
    @Override
    public void run()
    {
        System.out.println("Consumer thread "+Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
