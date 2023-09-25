/**
 * Project Name : JavaProgramming and Application HW04.1
 * Program's purpose and basic function :
 * - class truck
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
package HW04_1_Vehicle_Interface;

public class Truck extends Vehicle {
    private int cargo_capa; // cargo capacity in ton

    public Truck(String color, String vtype, int eng_capa, Person driver, int cargo_capa) {
        super(color, vtype, eng_capa, driver);
    }

    public int getCagoCapa() {
        return this.cargo_capa;
    }

    public String toString() {
        String str = "%s truck(driver : %s)".formatted(this.getColor(), this.getDriver());
        return str;
    }
    //Interface overriding
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
