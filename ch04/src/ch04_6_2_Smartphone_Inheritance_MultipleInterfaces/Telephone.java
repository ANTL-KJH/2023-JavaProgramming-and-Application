package ch04_6_2_Smartphone_Inheritance_MultipleInterfaces;

public abstract class Telephone {
    int tel_number;
    public abstract void makeCall(int destination);
    public abstract void recvCall(int source);
    public Telephone(int phone_number) {
        this.tel_number = phone_number;
    }
}
