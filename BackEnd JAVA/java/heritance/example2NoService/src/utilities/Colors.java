package utilities;

public enum Colors {
    WHITE("white"), BLACK("black"), BLUE("blue"), RED("red"),GREY("grey");

    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "color='" + color + '\'' +
                '}';
    }
}
