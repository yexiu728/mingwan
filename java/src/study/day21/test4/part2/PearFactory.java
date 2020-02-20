package study.day21.test4.part2;

public class PearFactory implements Factory {

    @Override
    public Fruit creatFruit() {
        return new Pear();
    }
}
