package RectangleAPP.entities;

public class Rectangle {

    private int base;
    private int height;
    private int surface;
    private int perimeter;

    public Rectangle(){

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;


    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", surface=" + surface +
                ", perimeter=" + perimeter +
                '}';
    }
}
