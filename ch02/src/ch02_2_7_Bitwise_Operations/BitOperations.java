package ch02_2_7_Bitwise_Operations;

import java.util.Scanner;

public class BitOperations {
    public static void printInt_Bits(int data) {
        int bit;
        for (int n = 31; n >= 0; n--) {
            bit = (data >> n) & 0x1;
            System.out.printf("%d", bit);
            if (n % 8 == 0)
                System.out.print(" ");
        }
    }

    public static enum BinOp_Type {ADD, SUB, MUL, DIV, MOD, BIT_AND, BIT_OR, BIT_XOR, BIT_NOT,SHIFT_LEFT, SHIFT_RIGHT}
    public static String bop_sign[] = {"+", "-", "*", "/", "%", "&", "|", "^", "~", "<<", ">>"};
    public static void printBitOperation(int x, int y, int z,BinOp_Type bop)
    {
        if(bop !=BinOp_Type.BIT_NOT)
        {
            System.out.print("   ");
            printInt_Bits(x);
            System.out.print("\n");
        }
        System.out.printf("%2s ", bop_sign[bop.ordinal()]);
        printInt_Bits(y);
        System.out.print("\n");
        System.out.print(" ------------------------------------\n");
        System.out.print(" ");
        printInt_Bits(z);
        System.out.print("\n");
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int data_1, data_2, data_3, data_4, data_5, data_6, data_7;
        int k = 3;
        String cin_data;

        System.out.print("\nInput first hexadecimal integer (00000000 ~ FFFFFFFF) : ");
        cin_data = cin.next();
        data_1 = Integer.valueOf(cin_data, 16);
        System.out.printf("First input data (Hexa-decimal) %08X = (Decimal) %d = (Octal) %#o = (Binary) ", data_1, data_1,
                data_1);
        printInt_Bits(data_1);
        System.out.print("\n");

        System.out.print("\nInput second hexadecimal integer (00000000 ~ FFFFFFFF) : ");
        cin_data = cin.next();
        data_2 = Integer.valueOf(cin_data, 16);
        System.out.printf("Second input data (Hexa-decimal) %08X = (Decimal) %d = (Octal) %#o = (Binary) ", data_2, data_2,
                data_2);
        printInt_Bits(data_2);
        System.out.print("\n");

        /* bit-wise AND */
        data_3 = data_1 & data_2;
        System.out.printf("\nBit-wise AND of two input data (%08X & %08X) => %08X\n", data_1, data_2, data_3);
        printBitOperation(data_1, data_2, data_3, BinOp_Type.BIT_AND);
        /* bit-wise OR */
        data_4 = data_1 | data_2;
        System.out.printf("\nBit-wise OR of two input data (%08X | %08X) => %08X\n", data_1, data_2, data_4);
        printBitOperation(data_1, data_2, data_4, BinOp_Type.BIT_OR);
        /* bit-wise XOR */
        data_5 = data_1 ^ data_2;
        System.out.printf("\nBit-wise OR of two input data (%08X | %08X) => %08X\n", data_1, data_2, data_5);
        printBitOperation(data_1, data_2, data_5, BinOp_Type.BIT_XOR);
        /* Shift Left */
        data_6 = data_1 << k;
        System.out.printf("\nShift Left of (%08X << %08X) => %08X\n", data_1, k, data_6);
        printBitOperation(data_1, k, data_6, BinOp_Type.SHIFT_LEFT);
        /* Shift Right */
        data_7 = data_1 >> k;
        System.out.printf("\nShift Right of (%08X >> %08X) => %08X\n", data_1, k, data_7);
        printBitOperation(data_1, k, data_7, BinOp_Type.SHIFT_RIGHT);
    }
}
