class D{
    public D(){
        System.out.println("A");
    }
    public D(int i){
        System.out.println("AA");
    }
}
class E extends D{
    public E(){
        super();
        System.out.println("B");
    }
    public E(int i)
    {
        super(i);
        System.out.println("BB");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        E obj=new E(8);
    }
}
