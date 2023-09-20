/**
 * Project Name : JavaProgramming and Application HW04.1
 * Program's purpose and basic function :
 * - class bus
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
package HW04_1_Vehicle_Interface;

public class Bus extends Vehicle {
    private int num_seats;
    private int num_passengers;

    public Bus(String color, String vtype, int eng_capa, Person driver, int num_seats) {
        super(color, vtype, eng_capa, driver);
        this.num_seats = num_seats;
        this.num_passengers = 0;
    }

    public String toString() {
        String str = "%s bus(driver : %s)".formatted(this.getColor(), this.getDriver());
        return str;
    }

    @Override
    public void forward(int speed) {
        System.out.printf("moving forward at speed %d Km/h; ", speed);
    }

    @Override
    public void turn(int angle) {
        System.out.printf("turning %d degree; ", angle);
    }

    @Override
    public void stop() {
        System.out.print("stopping;\n");
    }

}
