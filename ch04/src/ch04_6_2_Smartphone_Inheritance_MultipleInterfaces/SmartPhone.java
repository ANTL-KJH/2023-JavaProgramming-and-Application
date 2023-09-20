package ch04_6_2_Smartphone_Inheritance_MultipleInterfaces;

public class SmartPhone extends Telephone implements I_MP3, I_Camera, I_AudioRecorder{
    private String maker;
    private String model;
    public SmartPhone(int tel_number, String maker, String model) {
        super(tel_number);
        this.maker = maker;
        this.model = model;
    }
    public String toString() {
        String str = String.format("SmartPhone(tel_no = %d, maker = %s, model = %s)", this.tel_number, this.maker, this.model);
        return str;
    }
    public void playMusic() {
        System.out.printf("SmartPhone(%d):: start playing a MP3 music ...\n", this.tel_number);
    }
    @Override
    public void makeCall(int call_destination) {
        System.out.printf("SmartPhone(%d):: making a call to %d ...\n", this.tel_number, call_destination);
    }
    @Override
    public void recvCall(int call_source) {
        System.out.printf("SmartPhone(%d):: receiving a call from %d ...\n", this.tel_number, call_source);
    }
    @Override
    public void takePicture() {
        System.out.printf("SmartPhone(%d):: taking a picture ...\n", this.tel_number);
    }
    @Override
    public void recordVideo() {
        System.out.printf("SmartPhone(%d):: recording a video ...\n", this.tel_number);
    }
    @Override
    public void stopMusic() {
        System.out.printf("SmartPhone(%d):: stop playing a MP3 music ...\n", this.tel_number);
    }
    @Override
    public void recordAudio() {
        System.out.printf("SmartPhone(%d):: recording an audio ...\n", this.tel_number);
    }
    @Override
    public void playAudio() {
        System.out.printf("SmartPhone(%d):: playing an audio ...\n", this.tel_number);
    }
}
