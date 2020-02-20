package study.day21.test3;

public class Demo extends GetTime {
    @Override
    void code() {
        int count = 0;
        for (int i = 0; i < 100000000; i++) {
            count++;
        }
    }
}
