package Chuong6.Bai6_1;

public class Rectangle extends Shape {

    @Override
    public double getArea () {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color,boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double  getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String toString(){
        return "Rectangle[" + super.toString() + "width=" + width + ", length=" + length + "]";
    }
}
