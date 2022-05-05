interface Writer{
     void show();//by default public abstract
}
class M  implements Writer{
    public void show(){
        System.out.println("abc");
    }
}
class N implements Writer{
    public void show(){

        System.out.println("def");
    }

}
class Kit {
    public void some(Writer m){
    m.show();
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Writer obj=new M();
        Writer obj1=new N();
        Kit k=new Kit();
        k.some(obj1);
    }
}
