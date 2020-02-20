package study.day21.test4.part1;

public class FruitFactory {

    public Fruit creatFruit(String type) {
        Fruit fruit = null;
        if ("Apple".equals(type)) {
            fruit = new Apple();
        } else if ("Pear".equals(type)) {
            fruit = new Pear();
        }

        return fruit;
    }
}
