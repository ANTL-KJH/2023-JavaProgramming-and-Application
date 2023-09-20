package ch04_6_2_Smartphone_Inheritance_MultipleInterfaces;

public class App_Smartphone {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(1234, "Samsung", "S2023");
        System.out.printf("My Smart Phone = %s\n", mySmartPhone);
        mySmartPhone.makeCall(5678);
        mySmartPhone.recvCall(3579);
        mySmartPhone.playMusic();
        mySmartPhone.takePicture();
        mySmartPhone.recordAudio();
        mySmartPhone.playAudio();
    }
}
