package Chuong2.Bai2_10;

public class TestMyRectangle {
    public static void main(String[] args) {
        //Kiem tra lop MyPoint
        MyPoint p1 = new MyPoint(1, 2);
        System.out.println("p1 : "+p1);
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("p2 : "+p2);

        System.out.println("Kiem tra lop MyRectangle : ");
        MyRectangle r1 = new MyRectangle(1,2,5,6);
        System.out.println("m1 : "+r1);
        MyRectangle r2 = new MyRectangle(p1,p2);
        System.out.println("m2 : "+r2);

        System.out.println("Diem goc ben trai cua r1 = "+r1.getTopLeft());
        System.out.println("Diem goc ben phai cua r1 = "+r1.getBottomRight());
//        System.out.println("Diem goc ben trai cua r2 = "+r2.getTopLeft());
//        System.out.println("Diem goc ben phai cua r2 = "+r2.getBottomRight());

        // setter
        r1.setTopLeft(new MyPoint(0,0));
        r1.setBottomRight(new MyPoint(10,10));
        System.out.println("r1 sau khi doi  : "+r1);
    }
}
