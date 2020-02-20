package study.day21.test3;

public abstract class GetTime {
    abstract void code();

    public final long getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
