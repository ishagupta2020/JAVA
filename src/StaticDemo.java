class Employee {
    int eid;
    String name;
    static String ceo;
    public void show() {
        System.out.println(eid +" "+name+ " " + ceo);
    }
}
public class StaticDemo {
    public static void main(String[] args){
              Employee obj=new Employee();
        obj.eid=10;
        obj.name="isha";
        obj.ceo="manish";

         Employee obj1=new Employee();
        obj1.eid=12;
        obj1.name="diya";
        obj1.ceo="manish";

        obj1.ceo="ram";
        obj.show();
        obj1.show();
    }
}
