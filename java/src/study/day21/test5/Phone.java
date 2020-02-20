package study.day21.test5;

public class Phone extends PhoneAdapter {

    @Override
    public void sendMsg() {
        System.out.println("发短信");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
