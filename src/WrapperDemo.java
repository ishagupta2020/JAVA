public class WrapperDemo {
    public static void main(String[] args) {
        int i=5;//primitive datatype
        Integer obj=new Integer(i);//boxing or wrapping
        // or putting primitive variable inside object
        int j=obj.intValue();//unboxing or taking out the value from object
        Integer value = i;//autoboxing
        int k=value;//autounboxing
    }
}
//primitive datatype       //wrapper classes
//int                       Integer
//byte                       Byte
//short                     Short
//long                       Long
//float                        Float
//double                       Double
//char                          Character
//boolean                      Boolean
