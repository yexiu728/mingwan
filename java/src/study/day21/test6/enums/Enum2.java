package study.day21.test6.enums;

public enum Enum2 {
    TREE("松树"),
    FLOWER("玫瑰");

    private String value;

    Enum2(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
