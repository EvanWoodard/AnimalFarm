package animalfarm;
public class Cow extends FarmAnimal {  // Private can't be used on a top level class
    public Cow() {
        super("Cow");
    }
    public void doTrick() {
        var x = 2;
        var y = 2;
        var z = 1;

        System.out.println(x+y-z + ", Quick Maffs");
    }

    public void speak() {
        System.out.println("Mooo");
    }
}