interface Toy{
    int num=5;
    void abc();
    static void show(){
        System.out.println("abc");
    }
}
class DemoS implements Toy{
    public void abc() {
        System.out.println("def");
    }
}
public class StaticMethodInterface {
    public static void main(String[] args) {
        Toy.show();
    }
}
