import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        LinkedList<Integer> obj1 = new LinkedList<>();
        obj.add(4);
        obj.add(9);
        obj.add(4);
        obj.add(2);
        obj1.add(14);
        obj1.add(17);
        obj1.add(18);
        obj.addAll(obj1);
        obj.addFirst(999);
        obj.addLast(2222);
        System.out.println(obj.contains(444));
        obj.offer(12);
        obj.offerLast(13);
        obj.offerFirst(98);
        obj.poll();
        obj.pollFirst();
        obj.pollLast();
     obj.push(14);
     obj.pop();
     obj.clone();
     obj.clear();
        System.out.println(obj.indexOf(12));
        System.out.println(obj.lastIndexOf(4));
        for (int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i));
            System.out.print(",");
        }
    }
}
