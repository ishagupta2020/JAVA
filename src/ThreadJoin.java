class L extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("a");
            }
        }
            System.out.println(Thread.currentThread());
        }
    }

public class ThreadJoin{
    public static void main(String[] args) throws InterruptedException {
        L t1=new L();
        L t2=new L();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("bye");
        System.out.println(t1.isAlive());


    }
}

