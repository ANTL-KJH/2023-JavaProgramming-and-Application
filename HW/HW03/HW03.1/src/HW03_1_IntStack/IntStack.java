/**
 * Project Name : JavaProgramming and Application HW03.1
 * Program's purpose and basic function :
 * - Implementation of a Stack Structure Using Integer Array
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.03
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.03			v1.00			First Write
 * JH KIM               2023.09.06          v1.01           Func push return type changed(int->void)
 */
package HW03_1_IntStack;

import java.util.Arrays;

public class IntStack {
    private int[] int_array;
    private int max_stack_size;
    private int stack_top = -1; // initial position

    public IntStack(int max_stack_size) {
        this.max_stack_size = max_stack_size;
        this.int_array = new int[max_stack_size];
        Arrays.fill(this.int_array,-1);
        this.stack_top = -1;
    }

    public void push(int entry)
    {
        this.stack_top++;
        this.int_array[stack_top] = entry;
    }

    public int pop()
    {
        int temp = this.int_array[this.stack_top];
        this.int_array[stack_top] = -1;
        this.stack_top--;
        return temp;
    }

    public boolean isEmpty()
    {
        if (this.stack_top == -1)
            return true;
        return false;
    }

    public boolean isFull()
    {
        if (this.stack_top == this.max_stack_size - 1)
            return true;
        return false;
    }
    public void print()
    {
        for (int i=0; i<=this.stack_top; i++)
            System.out.printf("%3d",int_array[i]);
    }
}
