public class StringDemo {
    public static void main(String[] args) {
        String s1="hello";
        //array of characters
        char ch[]={'h','i','i'};
        String s2=new String(ch);
        //String literal
        String s3=new String("java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //byte to char conversion
        byte ascii[]={65,66,67,68,69,70};
        String s4=new String(ascii,2,3 );
        System.out.println(s4);
        //concatenation
      // 1. by + operator
        String s5="9";
        System.out.println("She is " +s5 +"years old");
        //length of string
        char c[]={'a','b','c','d'};
        String s6=new String(c);
        System.out.println(s6.length());
//immutability of string
        String s7="sachin";
        s7.concat("tendulkar");//2.()concat method
        System.out.println(s7);
        String s8="sachin";
        s8=s8.concat("tendulkar");
        System.out.println(s8);

    }

    }

