package homework.day4.day5.test3;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void eat() {
        System.out.println("年龄为" + this.age + "的" + this.name + "正在吃饭. . . .");
    }

    public void teach() {
        System.out.println("年龄为" + this.age + "的" + this.name + "正在亢奋地讲着" + this.content + "的知识. . . . . .");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
