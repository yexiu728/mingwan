package study.day21.test1;

// 装饰设计模式
public class Test1 {
    public static void main(String[] args) {
        Student stu = new Student();
        StudentStrong stuStrong = new StudentStrong(stu);

        stu.study();
        System.out.println("==========");
        stuStrong.study();
    }
}
