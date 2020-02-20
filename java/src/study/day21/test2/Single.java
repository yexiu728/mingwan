package study.day21.test2;

// 饿汉式
public class Single {

    static Single single = new Single();

    public static Single getSingle() {
        return single;
    }

}
