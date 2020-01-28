package brains.geek;

public class Cat  {

    private String name;
    private int appetite;
    private boolean repletion;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        this.repletion = p.decreaseFood(appetite);
    }

    public boolean getRepletion () {
        return this.repletion;
    }

}
