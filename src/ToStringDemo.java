class ToStringDemo{
    int number;
    String name;
    String age;

    ToStringDemo(int number, String name, String age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "ToStringDemo{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToStringDemo Obj=new  ToStringDemo(1,"ram","19");
        ToStringDemo obj1=new ToStringDemo(2,"sita","20");
        System.out.println(Obj);
        System.out.println(obj1);
    }

}
