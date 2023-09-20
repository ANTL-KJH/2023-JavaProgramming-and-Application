package Animal_Interface;

public abstract class Animal implements I_Communication{
    private String species; /* Mammal, Bird, Pisces, Amphibia, Reptilia */
    public Animal(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return this.species;
    }
}
