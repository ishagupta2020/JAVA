class You implements Runnable{
    public void run(){


        System.out.println("abc");

    }


}
public class ThreadByRunnable {
    public static void main(String[] args) {
        You obj=new You();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
