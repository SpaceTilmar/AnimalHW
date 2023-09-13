package animals.stuff;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] zebraNames = {"Brad", "Chad", "Tyler", "Kevin"};
        String[] platypusNames = {"Perry" , "Also Perry" , "A Normal Platypus(Not Perry)"};
        String[] dogNames = {"Tux"};
        Animal zebra = new Animal(4, true, zebraNames, "Zebra Noises");
        Animal platypus = new Animal(3, true, platypusNames, "Grrr");
        Animal dog = new Animal(1, true, dogNames, "Bark bark bark");
        dog.printAnimalSound();
        System.out.println("++++++++++");
        dog.printAnimalStatus();
        System.out.println("----------");
        platypus.printAnimalSound();
        System.out.println("++++++++++");
        platypus.printAnimalStatus();
        System.out.println("----------");
        zebra.printAnimalSound();
        System.out.println("++++++++++");
        zebra.printAnimalStatus();
        System.out.println("----------");
    }
}