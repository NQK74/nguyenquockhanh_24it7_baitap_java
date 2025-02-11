package Chuong6.Bai6_8;

public class MovablePoint implements IMoveUp, IMoveDown ,IMoveLeft ,IMoveRight {
    int x , y , xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
            "x=" + x +
            ", y=" + y +
            ", xSpeed=" + xSpeed +
            ", ySpeed=" + ySpeed +
            '}';
    }



    @Override
    public void moveDown() {
        this.y+= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }
}
