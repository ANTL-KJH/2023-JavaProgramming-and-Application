package ch10_TimerRunnable;
public class App_TimerRunnable {
    public static void main(String[] args) {
        Thread th_digits = new Thread(new TimerRunnableDigits());
        th_digits.start();
        Thread th_abc = new Thread(new TimerRunnableABC());
        th_abc.start();
    }
}
