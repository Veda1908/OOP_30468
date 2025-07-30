package sample_programs;

public class Q1_types {
    public static void main(String[] args) {
    	byte var_b = 10;
    	short var_s = 1000;
        int var_i = 100000;
        long var_l = 10000000000L;
        float var_f = 10.5f;
        double var_db = 20.99;
        char var_c = 'a';
        boolean bool = true;
        System.out.println("byte value: " + var_b + " and Size: " + Byte.SIZE + " bits");
        System.out.println("short value: " + var_s + " and Size: " + Short.SIZE + " bits");
        System.out.println("int value: " + var_i + " and Size: " + Integer.SIZE + " bits");
        System.out.println("long value: " + var_l + " and Size: " + Long.SIZE + " bits");
        System.out.println("float value: " + var_f + " and Size: " + Float.SIZE + " bits");
        System.out.println("double value: " + var_db + " and Size: " + Double.SIZE + " bits");
        System.out.println("char value: " + var_c + " and Size: " + Character.SIZE + " bits");
        System.out.println("boolean value: " + bool + " and Size: 1 bit");
    }
}
    
