public class Task {
    protected int _priority;
    protected String _value;
    public Task() {}
    public Task(int key, String value) {
        this._priority = key;
        this._value = value;
    }
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
