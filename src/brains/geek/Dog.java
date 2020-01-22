package brains.geek;

public class Dog extends Animal {

    private double runLimit = 500.0;
    private double swimLimit = 10.0;
    private double jumpHeightLimit = 0.5;
    private static int countDogs;

    public Dog (String name) {
        super(name);
        Dog.countDogs++;
    }

    public Dog (String name, double runLimit, double swimLimit, double jumpHeightLimit) {
        super(name);
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpHeightLimit = jumpHeightLimit;
        Dog.countDogs++;
    }

    @Override
    public String run(double distance) {
        if (distance > runLimit) {
            return "Пес " + getName() + " не может пробежать так много";
        } else {
            return "Пес " + getName() + " пробежал " + distance + " м";
        }
    }

    @Override
    public String swim(double distance) {
        if (distance > swimLimit) {
            return "Пес " + getName() + " не может проплыть так много";
        } else {
            return "Пес " + getName() + " проплыл " + distance + " м";
        }
    }

    @Override
    public String jump(double height) {
        if (height > jumpHeightLimit) {
            return "Пес " + getName() + " не может прыгнуть так высоко";
        } else {
            return "Пес " + getName() + " прыгнул на " + height + " м";
        }
    }

    public static int getCountDogs() {
        return Dog.countDogs;
    }
}