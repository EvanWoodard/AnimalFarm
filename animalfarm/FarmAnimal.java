package animalfarm;

abstract public class FarmAnimal {
    protected String name;
    public FarmAnimal(String animalName) {
        this.name = animalName;
    }

    public String getName() {
        return this.name;
    }
    public abstract void doTrick();

    public void speak() {
        System.out.println("Old McDonald had a farm!");
    }
}