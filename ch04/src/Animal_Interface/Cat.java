package Animal_Interface;

public class Cat extends Animal{
    public Cat () {
        super("Mammal");
    }
    public String toString() {
        String str = "Cat (%s)".
                formatted(this.getSpecies());
        return str;
    }
    @Override
    public void makeSound() {
        System.out.print(" meows !!");
    }
}
