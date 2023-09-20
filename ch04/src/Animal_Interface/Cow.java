package Animal_Interface;

public class Cow extends Animal{
    public Cow() {
        super("Mammal");
    }
    public String toString() {
        String str = "Cow (%s)".
                formatted(this.getSpecies());
        return str;
    }
    @Override
    public void makeSound() {
        System.out.print(" moos !!");
    }
}
