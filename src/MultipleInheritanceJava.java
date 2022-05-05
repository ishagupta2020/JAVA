interface Tea{
    void show();
    default void Abc(){
        System.out.println("tea");
    }
}


interface Drink{
    default void Abc(){
    System.out.println("Drink");
}
}

class Coffee implements Tea,Drink{
    public void show() {

        System.out.println("def");
    }
    public void Abc(){
        Drink.super.Abc();
    }

}
public class MultipleInheritanceJava {
    public static void main(String[] args) {
       Tea obj=new Coffee();
       obj.show();
       obj.Abc();
    }
}