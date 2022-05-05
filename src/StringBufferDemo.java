public class StringBufferDemo {
    public static void main(String[] args) { StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb.capacity());
        //append()method
        sb.append("java");
        System.out.println(sb);
        //replace ()method
        sb.replace(1,3,"hello");
        System.out.println(sb);
        //insert()method
        sb.insert(0,"hii");
        System.out.println(sb);
        //delete()method
        sb.delete(0,11);
        System.out.println(sb);
      //  reverse()method
        sb.reverse();
        System.out.println(sb);

        //capacity=16+string length
        sb.append("is a beautiful language");
        System.out.println(sb.capacity());
        //ensureCapacityMethod()
        sb.ensureCapacity(45);
        System.out.println(sb.capacity());



    }
}
