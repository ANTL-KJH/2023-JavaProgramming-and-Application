package Animal_Interface;

public class Frog extends Animal{
    public Frog() {
        super("Amphibia");
    }
    public String toString() {
        String str = "Frog (%s)".
                formatted(this.getSpecies());
        return str;
    }
    @Override
    public void makeSound() {
        System.out.print(" croaks !!");
    }
}
