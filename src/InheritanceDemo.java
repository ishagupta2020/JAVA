class A{   //
    public int add(int i,int j){
       int result=i+j;
       return result;
    }
}
class B extends A{  //single inheritance
    public int sub(int i,int j){
        int result=i-j;
        return result;
    }
}
class C extends B{     //multilevel inheritance
    public int multi(int i,int j){
        int result=i*j;
        return result;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        C obj=new C();
        System.out.println(obj.add(5,6));
        System.out.println(obj.sub(7,4));
        System.out.println(obj.multi(8,8));
    }
}
