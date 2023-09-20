package ch04_7_1_Wrapper_Integer;

public class App_WrapperInteger {
    public static void main(String[] args) {
        String str_dec, str_oct, str_hex, str_bin;
        System.out.printf("%4s %4s %4s %8s\n", "dec", "oct", "hex", "bin");
        for(int i=0; i<16; i++) {
            str_dec = Integer.toString(i);
            str_oct = Integer.toOctalString(i);
            str_hex = Integer.toHexString(i);
            str_bin = Integer.toBinaryString(i);
            System.out.printf("%4s %4s %4s %8s\n", str_dec, str_oct, str_hex, str_bin);
        }
    }
}
