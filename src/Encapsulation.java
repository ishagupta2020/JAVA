//encapsulation=binding of data into methods
class W {
    private int RollNo;
    private String Name;

    //getter and setter methods
    // setter
    public void setRollNo(int RollNo) {
       this.RollNo =RollNo ;
    }

    //getter
    public int getRollNo()
     {
        return RollNo;

    }

    //setter
    public void setName(String Name) {
        this.Name=Name;
    }

    public String getName() {

        return Name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        W obj = new W();
        obj.setRollNo(10);
        obj.setName("isha");
        System.out.println(obj.getName());
        System.out.println(obj.getRollNo());
    }
}
