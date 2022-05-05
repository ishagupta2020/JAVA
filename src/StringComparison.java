

public class StringComparison {
    public static void main(String[] args) {
        //equals()method
        String s1 = "Ram";
        String s2 = "Ram";
        String s3 = "Shyam";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        //equalsIgnoreCase()method
        String s4 = "ram";
        System.out.println(s1.equalsIgnoreCase(s4));
        //comparison by == operator
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        //compareTo()method
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        //substring
        String s5 = "     Rakesh    ";
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(2, 5));
        //ToUpperCase()Method
        System.out.println(s5.toUpperCase());
        String s6 = "SITA";
        System.out.println(s6.toLowerCase());
        //startsWith()method
        System.out.println(s5.startsWith("Ra"));
        System.out.println(s5.startsWith("s"));
        //endsWith()Method
        System.out.println(s5.endsWith("h"));
        //Trim()methods
        //remove white spaces before and after string
        System.out.println(s5.trim());
        //replace()method
        String s7 = "Java is object oriented.Java is good";
        System.out.println(s7.replace("Java", "Kava"));
        //charAt()method
        System.out.println(s6.charAt(2));

    }
}








