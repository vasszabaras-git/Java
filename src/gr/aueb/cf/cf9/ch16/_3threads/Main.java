package gr.aueb.cf.cf9.ch16._3threads;

public class Main {

    public static void main(String[] args) {
        Runnable worker = new WorkerThread();
        Runnable worker2 = new WorkerThread();
        WorkerThread worker3 = new WorkerThread();
        WorkerThread worker4 = new WorkerThread();


        Thread myThread = new Thread(worker);
        myThread.start();

        new Thread(worker2).start();
        new Thread(worker3).start();
        new Thread(worker4).start();

    }
}