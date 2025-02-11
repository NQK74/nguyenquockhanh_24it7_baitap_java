package Chuong4.Bai4_5;

public class Square extends Rectangle{
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color , boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return  getLength();

    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
    public void setWidth(double side) {
        setWidth(side);
    }
    public void setLength(double side) {
        setLength(side);
    }
    public String toString() {
        return "Square["+super.toString()+"]";
    }
}
