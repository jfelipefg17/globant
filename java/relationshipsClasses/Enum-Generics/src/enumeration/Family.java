package enumeration;

public enum Family {
    PAPA(45,"julio cesar"), MAMA(50,"yely giraldo"), HERMANO(23,"pablo florez");

    private int age;
    private String name;

    Family(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
