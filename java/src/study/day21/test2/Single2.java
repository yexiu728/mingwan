package study.day21.test2;

// 懒汉式
public class Single2 {

    static Single2 single2;

    public static Single2 getSingle2() {
        if (single2 == null) {
            single2 = new Single2();
        }

        return single2;
    }

}
