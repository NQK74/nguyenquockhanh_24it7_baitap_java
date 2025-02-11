package Chuong4.Bai4_4;

public class main {
    public static void main(String[] args) {
        // Tạo một đối tượng Point
        Point p = new Point(2.5f, 3.7f);
        System.out.println("Point: " + p);

        // Thử nghiệm các phương thức của Point
        System.out.println("X: " + p.getX());
        System.out.println("Y: " + p.getY());
        p.setX(4.1f);
        p.setY(6.2f);
        System.out.println("New Point: " + p);
        float[] xy = p.getXY();
        System.out.println("X, Y: " + xy[0] + ", " + xy[1]);

        // Tạo một đối tượng MovablePoint
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 0.3f);
        System.out.println("Movable Point: " + mp);

        // Thử nghiệm các phương thức của MovablePoint
        System.out.println("X Speed: " + mp.getXSpeed());
        System.out.println("Y Speed: " + mp.getYSpeed());
        mp.setXSpeed(0.8f);
        mp.setYSpeed(0.6f);
        System.out.println("New Movable Point: " + mp);
        float[] speed = mp.getSpeed();
        System.out.println("X Speed, Y Speed: " + speed[0] + ", " + speed[1]);

        // Thử nghiệm phương thức move()
        mp.move();
        System.out.println("Moved Movable Point: " + mp);
    }
}
