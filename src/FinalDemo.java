  class U {
    final int TOY;//constant cannot change

    public U(){
        TOY=8;
    }
    public  void show(){
        System.out.println("a");
    }
}
class V  extends U{
    public void show(){
        System.out.println("b");
    }



}
public class FinalDemo {
    public static void main(String[] args) {
        V obj=new V();
        obj.show();

    }
}
