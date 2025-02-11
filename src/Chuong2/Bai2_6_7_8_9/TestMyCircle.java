package Chuong2.Bai2_6_7_8_9;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(3,4);
        System.out.println("MyPoint 1 : " + myPoint);

        // Create a circle
        MyCircle myCircle = new MyCircle(1,2,5);
        System.out.println("MyCircle : " + myCircle);

        //Phuong thuc
        System.out.println("Khoang cach tu diem 1 den goc toa do : "+myPoint.distance());
        System.out.println("Chu vi cua hinh tron 1 : "+myCircle.getCircumference());
        System.out.println("Dien tich cua hinh tron 1 : "+myCircle.getArea());

        // Tao hinh tron va tinh khoang cach
        MyCircle myCircle2 = new MyCircle(new MyPoint(3,6),4);
        System.out.println("MyCircle2 : " + myCircle2);
        System.out.println("Khoang cach giua hinh tron 1 va hinh tron 2 : "+myCircle.distance(myCircle2));
    }
}
