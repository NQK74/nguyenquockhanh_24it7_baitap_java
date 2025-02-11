package Chuong2.Bai2_6_7_8_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Triangle
        MyTriangle  triangle = new MyTriangle(0,0,0,3,4,0);
        System.out.println("Tam giac : "+triangle);
        System.out.println("Chu vi : "+triangle.getPerimeter());
        System.out.println("Type : "+triangle.getType());

        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(1,1);
        MyPoint p3 = new MyPoint(2,0);

        MyTriangle triangle2 = new MyTriangle(p1,p2,p3);
        System.out.println("Tam giac 2 : "+triangle2);
        System.out.println("Chu vi : "+triangle2.getPerimeter());
        System.out.println("Type : "+triangle2.getType());
    }
}
