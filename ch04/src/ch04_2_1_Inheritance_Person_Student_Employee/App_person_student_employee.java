package ch04_2_1_Inheritance_Person_Student_Employee;

public class App_person_student_employee {
    public static void main(String[] args) {
        Student st = new Student("Kim", 1111, 2100, "ICE", "YU", 97.89);
        st.print(); System.out.printf("\n");
        Employee emp = new Employee("Choi", 2222, 3210, "Samsung", "SmartPhone");
        emp.print(); System.out.printf("\n");
    }
}
