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
 */
package HW03_1_IntStack;

public class IntStack_App {
    public static void main(String[] args) {
        final int stack_size = 20;      // max stack size
        int int_data;
        IntStack int_stack = new IntStack(stack_size);  // memory allocation
        System.out.printf("Testing push() operation of integer stack (stack_size = %d) ....\n", stack_size);
        for (int i=0; i<stack_size; i++) {
            int_data = (int) (Math.random() * stack_size);
            int_stack.push(int_data);   // push
            System.out.printf("After push (%3d) : ", int_data);
            int_stack.print(); System.out.print("\n");
        }
        System.out.printf("\nTesting pop() operation of integer stack (stack_size = %d) ....\n", stack_size);
        for (int i=0; i<stack_size; i++) {
            int_data = int_stack.pop(); // pop
            System.out.printf("After pop (%3d) : ", int_data);
            int_stack.print(); System.out.print("\n");
        }
    }
}
