package Chuong6.Bai6_4;

public class Test {
    public static void main(String[] args) {
        Movable Point = new MovablePoint(0, 0, 1, 1);
        System.out.println(Point);
        Point.moveUp();
        Point.moveLeft();
        System.out.println(Point);

        Movable crircle = new MovableCircle(1,1,3,3, 5);
        System.out.println(crircle);
        crircle.moveRight();
        crircle.moveDown();
        System.out.println(crircle);


    }
}
