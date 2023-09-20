/**
 * Project Name : JavaProgramming and Application HW04.1
 * Program's purpose and basic function :
 * - class vehicle
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
package HW04_1_Vehicle_Interface;

public abstract class Vehicle implements I_Drive {
    private String v_type; // vehicle type : Sedan, Bus, Truck
    private int eng_capa;
    private String v_color;
    private Person driver;

    public Vehicle(String color, String vtype, int eng_capa, Person driver) {
        this.v_type = vtype;
        this.eng_capa = eng_capa;
        this.v_color = color;
        this.driver = driver;
    }

    public String toString() {
        String str = "%s %s(driver : %s)".formatted(this.v_color, this.v_type, this.driver.getName());
        return str;
    }

    public String getVtype() {
        return this.v_type;
    }

    public int getEngCapa() {
        return this.eng_capa;
    }

    public String getColor() {
        return this.v_color;
    }

    public String getDriver() {
        return driver.toString();
    }
}
