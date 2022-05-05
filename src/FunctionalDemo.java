interface O {
    void show();
}
public class FunctionalDemo {
    public static void main(String[] args) {
        T obj = () -> System.out.println("abc");
        obj.show();
        }
    }


