package study.day21.test4.part2;

public class AppleFactory implements Factory {

    @Override
    public Fruit creatFruit() {
        return new Apple();
    }
}
