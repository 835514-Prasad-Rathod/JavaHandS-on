package section6;

import section5.Shape;

public class Rectangle extends Shape {
    int length;
    int breadth;

    protected double calculateArea() {
        return (length * breadth);
    }

    public Rectangle(int length, int breadth, String shapeName) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }

    public void Rectangle1(int length2, int breadth2, String shapeName) {
        // TODO Auto-generated constructor stub
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}
