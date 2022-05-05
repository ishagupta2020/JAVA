class G{
    public void show(){
        System.out.println("a");
    }
}
class H extends G{
    public void show(){
        super.show();
        System.out.println("b");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        H obj=new H();
        obj.show();
    }

}
