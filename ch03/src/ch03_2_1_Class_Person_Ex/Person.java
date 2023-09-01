package ch03_2_1_Class_Person_Ex;

public class Person {
    private String name; // data member
    private int reg_ID;
    static int num_person; // global variable for managements of class Person instances
    public Person()
    {
        // default constructor
    }
    public Person(String nm, int reg_ID){ // constructor
            this.name = nm;
            this.reg_ID = reg_ID;
            this.num_person += 1;
        }
        public void print_person () {
            System.out.printf("Person(name: %8s, reg_id: %7d, num_person: %2d)\n",
                    this.name, this.reg_ID, this.num_person);
        }
        public String getName () { // access member function
            return this.name;
        }
    }