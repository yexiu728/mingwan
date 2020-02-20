package study.day21.test1;

public class StudentStrong implements Coder {

    private Student stu;

    public StudentStrong(Student stu) {
        this.stu = stu;
    }

    @Override
    public void study() {
        stu.study();
        System.out.println("Hibernate");
        System.out.println("Struts2");
        System.out.println("Spring");
    }
}
