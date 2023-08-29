package ch02_9_1_for_loop_multiplication_table;

public class For_Loop_Multiplication_Table {
    public static void main(String[] arg)
    {
         for(int i=1;i<=9;i++)
         {
             for(int j=1;j<=9;j++)
             {
                 System.out.printf("%2d x %2d = %2d",i,j,i*j);
             }
             System.out.printf("\n");
         }
    }
}
