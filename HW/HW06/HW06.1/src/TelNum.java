/**
 * Project Name : JavaProgramming and Application HW06.1
 * Program's purpose and basic function :
 * - class TelNum
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.09
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.09			v1.00			First Write
 */
public class TelNum {
    // data member
    private int nation_code;
    private int region_number;
    private int switch_number;
    private int line_number;

    // constructor
    TelNum(int nationCode, int regionNumber, int switchNumber, int lineNumber) {
        this.nation_code = nationCode;
        this.region_number = regionNumber;
        this.switch_number = switchNumber;
        this.line_number = lineNumber;
    }
    // return string
    public String toString() {
        return "%03d-%03d-%04d-%04d".formatted(this.nation_code, this.region_number, this.switch_number, this.line_number);
    }
}
