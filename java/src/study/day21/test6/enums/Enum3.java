package study.day21.test6.enums;

public enum Enum3 {
    MAYUN("马云", "1964"),
    MAHT("马化腾", "1971");

    private String name;
    private String value;

    Enum3(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
