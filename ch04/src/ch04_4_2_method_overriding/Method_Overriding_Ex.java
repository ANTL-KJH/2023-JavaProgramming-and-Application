package ch04_4_2_method_overriding;

public class Method_Overriding_Ex {
    public static void main(String[] args)
    {
// If a Parent type reference refers to a Parent object, then Parent’s show is called
        Parent obj1 = new Parent();
        obj1.show();
// If a Parent type reference refers to a Child object Child's show() is called.
// This is called RUN TIME POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}
