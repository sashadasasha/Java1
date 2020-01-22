package brains.geek;

public abstract class Animal {
    private String name;
    private double runLimit;
    private double swimLimit;
    private double jumpHeightLimit;
    private static int countAnimals;

    abstract public String run(double distance);
    abstract public String swim (double distance);
    abstract public String jump (double height);

    public Animal(String name) {
        this.name = name;
        Animal.countAnimals ++;
    }

    public String getName() {
        return this.name;
    }

    public static int getCountAnimals() {
        return Animal.countAnimals;
    }
}
