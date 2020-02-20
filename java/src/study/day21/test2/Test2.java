package study.day21.test2;

// 单例设计模式
public class Test2 {
    public static void main(String[] args) {
        Single single1 = Single.getSingle();
        Single single2 = Single.getSingle();

        System.out.println(single1 == single2);

    }
}
