package Chuong3.Bai3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {

        MyPolynomial p1 = new MyPolynomial(new double[]{2,5});

        System.out.println("P1(x) = " + p1.toString());

        // Tạo đa thức p2 = 4x^2 + 2x + 1
        MyPolynomial p2 = new MyPolynomial(new double[]{2,3});
        System.out.println("P2(x) = " + p2.toString());

        // Tính giá trị của p1 tại x = 2
        System.out.println("P1(2) = " + p1.evaluate(5));

        // Cộng hai đa thức
        MyPolynomial sum = p1.add(p2);
        System.out.println("P1(x) + P2(x) = " + sum.toString());

        // Nhân hai đa thức
        MyPolynomial product = p1.multiply(p2);
        System.out.println("P1(x) * P2(x) = " + product.toString());

    }
}
