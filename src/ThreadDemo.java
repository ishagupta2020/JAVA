class Me extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("a");
            }

        }
        System.out.println("abc");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Me obj=new Me();
        Me obj1=new Me();
       // obj.start();
        //  obj.start();
       obj.run();
       obj1.run();
        System.out.println(obj.getName());
        obj.setName("hello");
        System.out.println(obj.getName());
    }
}
