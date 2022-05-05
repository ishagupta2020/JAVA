class Demo{
    int num1;
    int num2;
    //constructor
    //this keyword
  //  use to invoke the instance variable of current class
    //use to call constructor of same class
    public Demo(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

}
public class Student {
    public static void main(String[] args) {
        Demo obj = new Demo(5,6);
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}
