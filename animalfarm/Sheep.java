package animalfarm;
public class Sheep extends FarmAnimal {
    public Sheep() {
        super("Sheep");
    }
    public void doTrick() {
        System.out.println("Here's muh wool");
    }

    public void speak() {
        System.out.println("Baaaa...");
    }

    public int getLegs() {
        return 4;
    }
}