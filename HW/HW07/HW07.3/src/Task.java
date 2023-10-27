/**
 * Project Name : JavaProgramming and Application HW07.3
 * Program's purpose and basic function :
 * - class Task
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
public class Task {
    // data member
    protected int _priority;
    protected String _value;
    // constructor
    public Task() {}
    public Task(int key, String value) {
        this._priority = key;
        this._value = value;
    }
    // accessor
    public int getPriority() {
        return this._priority;
    }
    public String getValue() {
        return this._value;
    }
    public String toString() {
        String str = String.format("Task(%d, %s)", this._priority, this._value);
        return str;
    }
}
