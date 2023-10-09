public class TelNum {
    private int nation_code;
    private int region_number;
    private int switch_number;
    private int line_number;

    TelNum(int nationCode, int regionNumber, int switchNumber, int lineNumber) {
        this.nation_code = nationCode;
        this.region_number = regionNumber;
        this.switch_number = switchNumber;
        this.line_number = lineNumber;
    }

    public String toString() {
        return "%03d-%03d-%04d-%04d".formatted(this.nation_code, this.region_number, this.switch_number, this.line_number);
    }
}
