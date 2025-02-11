package Chuong6.Bai6_2;

public class Main {
    public static void main(String[] args) {
    GeometricObject circle = new Circle(5);
    GeometricObject rectangle = new Rectangle(4, 6);

        System.out.println(circle.toString());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("\n" + rectangle.toString());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
}
}
