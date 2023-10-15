package ch07_HeapPriQ_Entry;

public class Event {
    protected int _priority;
    protected String _value;
    public Event() {}
    public Event(int key, String value) {
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
        String str = String.format("Ev(%d, %s)", this._priority, this._value);
        return str;
    }
}
