package Chuong6.Bai6_1;

public class Circle extends Shape {

    protected double radius = 1.0;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color , boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "Circle["+super.toString()+"radius="+radius+"]";
    }

}
