package animals.stuff;

public class Animal {

    public String[] animalName;
    public int animalCount;
    public boolean animalAlive;
    public String sound;

    public Animal(int animalCount, boolean animalAlive, String[] animalName, String sound) {
        this.animalCount = animalCount;
        this.animalName = animalName;
        this.animalAlive = animalAlive;
        this.sound = sound;

    }
    public void printAnimalSound() {
        System.out.println(sound);
    }
    public void printAnimalStatus() {
        for (int i = 0; i < animalName.length; i++){
        System.out.println(animalName[i]);
        }
        System.out.println(animalCount);
        System.out.println(animalAlive);
    }

}
