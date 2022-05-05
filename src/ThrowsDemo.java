import java.io.*;
class I{
    public void show()throws IOException{
        throw new IOException("abc");
    }

}
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            I obj = new I();
            obj.show();
        } catch (Exception e) {
            System.out.println("def");
        } finally {
            System.out.println("ghi");
        }
    }
}
