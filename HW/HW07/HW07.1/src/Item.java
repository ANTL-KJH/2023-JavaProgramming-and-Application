/**
 * Project Name : JavaProgramming and Application HW07.1
 * Program's purpose and basic function :
 * - class Item
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
public class Item {
    // data member
    String name;
    int value;
    int weight;

    // constructor
    public Item(String nm, int val, int wt) {
        this.name = nm;
        this.value = val;
        this.weight = wt;
    }

    // return string
    public String toString() {
        String str;
        str = String.format("(%s, %d, %d)", this.name, this.value, this.weight);
        return str;
    }
}
