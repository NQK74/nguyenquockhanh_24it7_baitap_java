package Chuong6.Bai6_8;

public class Main {
    public static void main(String[] args) {

        IMoveUp moveUp = new MovablePoint(3,4,5,6);
        IMoveDown moveDown = new MovablePoint(3,4,5,6);
        IMoveLeft moveLeft = new MovablePoint(3,4,5,6);
        IMoveRight moveRight = new MovablePoint(3,4,5,6);

        moveLeft.moveLeft();
        System.out.println(moveLeft);
        moveDown.moveDown();
        System.out.println(moveDown);

        IMoveUp moveUp2 = new MovableCircle(2,3,1,2,5);
        IMoveDown moveDown2 = new MovableCircle(2,3,1,2,5);
        IMoveLeft moveLeft2 = new MovableCircle(2,3,1,2,5);
        IMoveRight moveRight2 = new MovableCircle(2,3,1,2,5);

        moveRight2.moveRight();
        System.out.println(moveRight2);
        moveUp2.moveUp();
        System.out.println(moveUp2);
    }
}
