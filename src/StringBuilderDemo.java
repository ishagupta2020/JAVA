public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
sb.append("hello");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("java is good language");
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.delete(0,13);
        System.out.println(sb);
        sb.insert(0,"hi");
        System.out.println(sb);
        sb.replace(0,2,"hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.ensureCapacity(35);
        System.out.println(sb.capacity());
    }
}
