class Test{
    public void add(int i,int j){
        System.out.println(i+j);
    }
    public void add(int i,int j,int k){
        System.out.println(i+j+k);
    }
    public void add(int i,double j){
        System.out.println(i+j);
    }
    public void add(double i,double j){
        System.out.println(i+j);
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.add(8,5,9);

    }
}
