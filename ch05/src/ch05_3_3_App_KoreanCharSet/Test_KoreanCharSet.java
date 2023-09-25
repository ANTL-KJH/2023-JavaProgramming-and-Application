package ch05_3_3_App_KoreanCharSet;

public class Test_KoreanCharSet {
    public static void main(String[] args) {
        String kor_str = "대한민국 한글";
        byte[] kor_bytes = kor_str.getBytes();
        String str_byte = new String(kor_bytes);
        System.out .println(str_byte);
    }
}
