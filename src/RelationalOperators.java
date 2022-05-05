public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //==,>,<,<=,>=,!=
        boolean c = a > b;
        System.out.println(c);
        boolean d = a < b;
        System.out.println(d);
        boolean e = a <= b;
        System.out.println(e);

        boolean f = a >= b;
        System.out.println(f);
        if (a == b) {
            System.out.println(a);
            if (a != b) {
                System.out.println(true);

            }
            else{
                System.out.println(false);
            }
        }
    }
}
