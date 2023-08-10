package enumeration;

public enum Family {
    PAPA(45,"julio cesar"), MAMA(50,"yely giraldo"), HERMANO(23,"pablo florez");

    private int age;
    private String name;

    private Family(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
