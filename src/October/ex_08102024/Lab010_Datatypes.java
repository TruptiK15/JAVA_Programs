package October.ex_08102024;

public class Lab010_Datatypes {
    public static void main(String[] args) {

        // Primitive Datatype
        byte b = 10;                // byte --> 1 Byte = 8 bits
        char a = 'A';               // char --> 2 Byte = 16 bits
        short s = 1234;             // short --> 2 Byte = 16 bits
        int i = 123456;             // integer --> 4 Byte = 32 bits
        float f = 3.14F;            // float --> 4 Byte = 32 bits
        long l = 123456789;         // long --> 8 Byte = 64 bits
        double d = 11.999999999;    // double --> 8 Byte = 64 bits
        boolean $ = true;           // boolean None

        System.out.println(b);      // byte
        System.out.println(a);      // char
        System.out.println(s);      // short
        System.out.println(i);      // integer
        System.out.println(f);      // float
        System.out.println(l);      // long
        System.out.println(d);      // double
        System.out.println($);      // boolean

       // Non-Primitive Datatype (User defined)
        String name = "Trupti";        // 8 Byte = 64 bits
        System.out.println(name);      // String
    }
}
