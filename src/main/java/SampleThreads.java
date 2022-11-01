public class SampleThreads {
    public static void main(String args[]){
        System.out.println("Starting program");

        newThread task=new newThread();
        task.start();

        Runnable runnable=new newThreadR();
        Thread  rTask=new Thread(runnable);
        rTask.start();

        System.out.println("Ending program");
    }
}

class newThread extends Thread{
    @Override
    public void run() {
        System.out.println("Print from thread");
    }
}
class newThreadR implements Runnable{
    @Override
    public void run() {
        System.out.println("Print from Runnable thread");

    }
}