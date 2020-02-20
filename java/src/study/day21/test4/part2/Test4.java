package study.day21.test4.part2;

// 工厂方法设计模式
public class Test4 {
    public static void main(String[] args) {

        AppleFactory af = new AppleFactory();
        Apple apple = (Apple) af.creatFruit();
        apple.whatIm();

        PearFactory pf = new PearFactory();
        Pear pear = (Pear) pf.creatFruit();
        pear.whatIm();

    }
}
