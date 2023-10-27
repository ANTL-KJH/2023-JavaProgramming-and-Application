/**
 * Project Name : JavaProgramming and Application HW07.3
 * Program's purpose and basic function :
 * - class GenericArray
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
public class GenericArray <E>{
    // data member
    protected Object[] genArray;
    protected int capacity;
    protected int size;
    // constructor
    public GenericArray(int capa) {
        this.genArray = new Object[capa];
        this.capacity = capa;
        this.size = 0;
    }
}
