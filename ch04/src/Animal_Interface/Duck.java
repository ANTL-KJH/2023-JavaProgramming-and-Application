package Animal_Interface;

public class Duck extends Animal{
    public Duck() {
        super("Bird");
    }
    public String toString() {
        String str = "Duck (%s)"
                .formatted(this.getSpecies());
        return str;
    }
    @Override
    public void makeSound() {
        System.out.print(" quacks !!");
    }
}
