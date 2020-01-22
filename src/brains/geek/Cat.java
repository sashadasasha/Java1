package brains.geek;

public class Cat extends Animal {

    private double runLimit = 200.0;
    private double jumpHeightLimit = 2.0;
    private static int countCats;

    public Cat (String name) {
        super(name);
        Cat.countCats ++;
    }

    public Cat (String name, double runLimit, double jumpHeightLimit) {
        super(name);
        this.runLimit = runLimit;
        this.jumpHeightLimit = jumpHeightLimit;
        Cat.countCats++;
    }

    @Override
    public String run(double distance) {
        if (distance > runLimit) {
            return "Кот " + getName() + " не может пробежать так много";
        } else {
            return "Кот пробежал " + distance + " м";
        }
    }

    @Override
    public String swim(double distance) {
        return "Кот не может плавать";
    }

    @Override
    public String jump(double height) {
        if (height > jumpHeightLimit) {
            return "Кот " + getName() +  " не может прыгнуть так высоко";
        } else {
            return "Кот " + getName() +  " прыгнул на " + height + " м";
        }
    }

    public static int getCountCats() {
        return Cat.countCats;
    }
}
