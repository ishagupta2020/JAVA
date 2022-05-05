class Task{
    public int add(int...n) {
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }

}
public class VarArgsDemo {
    public static void main(String[] args) {
        Task obj=new Task();
        System.out.println(obj.add(4,5,9,13,3));
    }
}
