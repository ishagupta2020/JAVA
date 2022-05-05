class Calc {
    int num1;
    int num2;
    int result;

    public void sum() {
        result = num1 + num2;
    }
}
    public class Main {
    public static void main(String[] args) {
        //Classes and objects
        Calc obj=new Calc();//constructor (used for allocating memory)
        obj.num1=5;
        obj.num2=8;
        obj.sum();
        System.out.println(obj.result);
    }
        }





