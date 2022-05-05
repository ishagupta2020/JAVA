class X{
    public void show(){
        System.out.println("a");
    }
}
class Y extends X{
    public void show(){

        System.out.println("b");
    }
}
class Z extends X{
    public void show(){

        System.out.println("c");
    }
}
public class DynamicDispatchDemo {
    public static void main(String[] args) {
        X obj=new Y();//runtime polymorphism
        obj.show();
        obj=new Z();//dynamic dispatch
        obj.show();
        }
    }

