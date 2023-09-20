package Animal_Interface;

public class Dog extends Animal{
    public Dog() {
        super("Mammal");
    }
    public String toString() {
        String str = "Dog (%s)"
                .formatted(this.getSpecies());
        return str;
    }
    @Override
    public void makeSound() {
        System.out.print(" barks !!");
    }
}
