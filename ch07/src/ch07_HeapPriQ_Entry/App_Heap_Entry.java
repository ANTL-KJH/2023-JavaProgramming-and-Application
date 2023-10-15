package ch07_HeapPriQ_Entry;

public class App_Heap_Entry {
    public static void main(String[] args) {
        Event[] events =
                { new Event(9, "Ev_9"), new Event(8, "Ev_8"), new Event(7, "Ev_7"), new Event(6, "Ev_6"), new Event(5, "Ev_5"),
                        new Event(4, "Ev_4"), new Event(3, "Ev_3"), new Event(2, "Ev_2"), new Event(1, "Ev_1"), new Event(0, "Ev_0")
                };HeapPriQ_Event heapPriQ_Ev = new HeapPriQ_Event("HeapPriQ_Event", 20);
        System.out.printf("Inserting events to heapPriQ_Ev :\n");
        for (Event ev : events) {
            System.out.printf("%s ", ev);
            heapPriQ_Ev.insert(ev);
        }
        System.out.printf("\nSequence of events by RemoveHeapMin() :\n");
        for (int i=0; i<events.length; i++) {
            Event ev = heapPriQ_Ev.removeHeapMin();
            System.out.printf("%s ", ev);
        }
    }
}
