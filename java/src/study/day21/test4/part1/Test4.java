package study.day21.test4.part1;

// 简单工厂
public class Test4 {
    public static void main(String[] args) {
        FruitFactory fac = new FruitFactory();

        Apple apple = (Apple) fac.creatFruit("Apple");
        apple.whatIm();

        Pear pear = (Pear) fac.creatFruit("Pear");
        pear.whatIm();

    }
}
