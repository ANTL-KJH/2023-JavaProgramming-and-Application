package ch02_3_2_printf_formatting;

public class printf_formatting {
    public static String get_binStr(int data, int n_bits)
    {
        int bit;
        String binStr="";
        for(int n = n_bits-1;n>=0;n--)
        {
            bit = (data>>n) & 0x1;
            if(bit ==1)
                binStr+="1";
            else
                binStr+="0";
        }
        return binStr;
    }
    public static void main(String[] args)
    {
        for (int n=0; n<=32;n++)
        {
            String n_bin_str = get_binStr(n,8);
            System.out.printf("%2d %#03o %#04X %8s\n",n,n,n,n_bin_str);
        }
    }
}
