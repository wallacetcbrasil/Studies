package first_class;

/**
 * Example class for the second class of variable exercise, data types and arithmetic operators.
 */

public class twoVarForType {
    
    public static void main(String[] args) {

        // numbers

        byte b1 = -128; // byte is -128 up until 127
        byte b2 = 127;
        
        short s1 = 32767; // short -32.768 up until 32.767
        short s2 = -32768;
        
        
        int i1 = 2147483647; // int -2.147.483.648 up until 2.147.483.647
        int i2 = -2147483648;
        
        
        long l1 = 9223372036854775807L; // long -9.223.372.036.854.775.808 up until 9.223.372.036.854.775.807
        long l2 = -9223372036854775808L;
        
        
        float f1 = 340282347F; // float 340282347E+38F
        float f2 = 302823489F;
        
        
        double d1 = 85.79769313486231570; // double 1.79769313486231570E+308
        double d2 = 1.79769313486231570D;

        // textual

        char c1 = '\u0084' ; // char: characters of 16-bit unicode
        //char c2 = 'tW'; have 2 characters but is permited only one

        String st1 = "Tututu"; //String: "Special" type


        // logic

        boolean bl1 = true ; // boolean is true or false
        boolean bl2 = false;


        // output
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(st1);
        System.out.println(bl1);
        System.out.println(bl2);
    }
}
