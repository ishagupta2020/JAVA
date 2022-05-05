interface Abc{
    void Test();
    default void show(){
        System.out.println("abc show");
    }
}
class Def implements Abc{
    public void Test(){
        System.out.println("def show");

    }
}
public class DefaultMethod {
    public static void main(String[] args) {
        Abc obj=new Def();
        obj.show();
        obj.Test();
    }
}
