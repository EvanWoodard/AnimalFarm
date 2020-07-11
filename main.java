import animalfarm.*;

public class Main {
    public static void main(String[] args) {
        Cow rupert = new Cow();
        Sheep brady = new Sheep();

        final String greeting = "Hello, ";

        FarmAnimal[] aminals = {rupert, brady};

        for (var i = 0; i < aminals.length; i++) {
            var name = aminals[i].getName();

            System.out.println(greeting + name + '!');

            aminals[i].speak();
        }
    }
}