package Chuong6.Bai6_5;

public class Test {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        System.out.println(circle.toString());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        Resizable ResizableCircle = new ResizableCircle(5);
        System.out.println(ResizableCircle.toString());
        ResizableCircle.resize(50);
        System.out.println(ResizableCircle.toString());
    }
}
