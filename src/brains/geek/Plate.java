package brains.geek;

import java.sql.SQLOutput;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food > n) {
            food -= n;
            System.out.println("Хорошо поел");
            return true;
        } else {
            System.out.println("Слишком мало еды");
            return false;
        }

    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void topUpPlate(int food) {
        this.food += food;
        System.out.println("Тарелка наполнена на " + food + " еды");
        this.info();
    }
}