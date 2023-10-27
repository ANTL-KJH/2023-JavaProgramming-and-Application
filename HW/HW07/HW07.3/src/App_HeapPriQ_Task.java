/**
 * Project Name : JavaProgramming and Application HW07.3
 * Program's purpose and basic function :
 * - App Heap Priority Queue
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
public class App_HeapPriQ_Task {
    public static void main(String[] args) {
        // task arr
        Task[] events = {
                new Task(9, "Task_9"), new Task(8, "Task_8"), new Task(7, "Task_7"), new Task(6, "Task_6"), new Task(5, "Task_5"),
                new Task(4, "Task_4"), new Task(3, "Task_3"), new Task(2, "Task_2"), new Task(1, "Task_1"), new Task(0, "Task_0")
        };
        HeapPriQ_Task heapPriQ_Ev_Task = new HeapPriQ_Task("HeapPriQ_Task", 20); // gen task priQ
        System.out.printf("Inserting events to heapPriQ_Ev_Task :\n");
        for (Task ev : events) {
            System.out.printf("%s ", ev);
            heapPriQ_Ev_Task.insert(ev);    // insert
        }
        System.out.printf("\nSequence of events by RemoveHeapMin() :\n");
        for (int i=0; i<events.length; i++) {
            Task ev = heapPriQ_Ev_Task.removeHeapMin(); // remove
            System.out.printf("%s ", ev);
        }
    }

}
