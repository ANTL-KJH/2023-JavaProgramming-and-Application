package Animal_Interface;

public class App_Interface_Animal {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Cow(),
                new Dog(),
                new Duck(),
                new Frog()
        };
        for (Animal ani : animals) {
            System.out.print(ani);
            ani.makeSound();
            System.out.println();
        }
    }
}
