package Chuong6.Bai6_3;

public class Test {
    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(0, 0, 1, 1);
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
    }
}
