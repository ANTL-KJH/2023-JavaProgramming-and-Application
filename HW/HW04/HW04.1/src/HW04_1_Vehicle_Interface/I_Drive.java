/**
 * Project Name : JavaProgramming and Application HW04.1
 * Program's purpose and basic function :
 * - Interface I_Drive
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
package HW04_1_Vehicle_Interface;

public interface I_Drive {
    public abstract void forward(int speed);
    public abstract void turn(int angle);
    public abstract void stop();
}
