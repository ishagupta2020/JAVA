public class ExceptionHandlingDemo {
    public static void main(String[] args) {
       try{
           int arr[]=null;
           arr[4]=8;
           int x = 4;
           int y = 0;

            int z = x / y;
            System.out.println(z);
        }
        catch(ArithmeticException e) {
            System.out.println("error");
        }
        catch(NullPointerException e){
            System.out.println("err");
        }
        finally{
            System.out.println("bye");
        }
    }
}
