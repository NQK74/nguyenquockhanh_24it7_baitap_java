package Chuong6.Bai6_5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100;
    }

    @Override
    public String toString() {
        return "ResizableCircle["+super.toString()+"]";
    }
}
