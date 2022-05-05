public class NestedTryDemo {
    public static void main(String[] args) {
       try{
           try{
               int arr[]=new int[5];
               arr[5]=10;
               System.out.println("abc");

           }catch(ArrayIndexOutOfBoundsException e) {
               System.out.println("def");
           }
               try{
                   int k=50/0;
               }
               catch(ArithmeticException e){
                   System.out.println("ghi");
               }
               catch(Exception e){
               System.out.println("handle");
           }
       }
       finally {
           System.out.println("ijk");
       }

    }
}
