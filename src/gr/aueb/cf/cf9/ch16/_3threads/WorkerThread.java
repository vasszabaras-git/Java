package gr.aueb.cf.cf9.ch16._3threads;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 2_100_000_000; i++) {
            if (i == 2_100_000_000) {
                System.out.println("Done!");
            }
        }
    }
}

/*
Runnable worker2 = new WorkerThread();
new Thread(worker2).start();*/
