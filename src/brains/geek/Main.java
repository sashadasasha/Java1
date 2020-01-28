package brains.geek;


import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        System.out.println(barsik.jump(1.5));
        Cat mashka = new Cat ("Машка");
        System.out.println(mashka.run(650.0));

        //Кот, которому в конструкторе можно задать ограничения по дистанции бега и прыжка
        Cat semen = new Cat ("Семен", 700,2.7);
        System.out.println(semen.run(650.5));
        System.out.println(semen.jump(2.4));

        Dog bagz = new Dog ("Багз");
        System.out.println(bagz.jump(3));
        System.out.println(bagz.run(400));
        System.out.println(bagz.swim(8.5));

        //Пес, которому в конструкторе можно задать ограничения по дистанции бега, прыжка и плавания

        Dog pluto = new Dog("Плуто", 1200.0, 50.0, 3);
        System.out.println(pluto.jump(2.5));
        System.out.println(pluto.run(900));
        System.out.println(pluto.swim(32.4));

        System.out.println("Всего животных: " + Animal.getCountAnimals());
        System.out.println("Всего котов: " + Cat.getCountCats());
        System.out.println("Всего собак: " +Dog.getCountDogs());
    }
}
