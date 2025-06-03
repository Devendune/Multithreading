package ProduceConsume;

public class ProduceTask implements Runnable
{
    SharedResource sharedResource;

    public  ProduceTask(SharedResource sharedResource)
    {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run()
    {
        System.out.println("Producer Thread "+Thread.currentThread().getName());
        //we have slept the producer thread for 5s to make sure that consumer thread goes inside first.
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResource.addItem();
    }
}
