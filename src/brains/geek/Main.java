package brains.geek;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();

        Cat[] cats = new Cat[4];
        Plate bigPlate = new Plate(250);
        cats[0] = new Cat("Stepa", 80);
        cats[1] = new Cat ("Murka", 60);
        cats[2] = new Cat ("Felix", 100);
        cats[3] = new Cat ("Pushok", 50);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bigPlate);
            System.out.println("Cытый котик? - " + cats[i].getRepletion());
        }

        // Наполним тарелку

        bigPlate.topUpPlate(200);

        //Накормим последнего голодающего
        cats[3].eat(bigPlate);
        //Проверим сытость
        System.out.println("Cытый котик? - " + cats[3].getRepletion());
        bigPlate.info();
    }
}
