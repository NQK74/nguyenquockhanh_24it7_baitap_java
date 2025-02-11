package Chuong3.Bai3_1;

public class TestMycomplex2 {
    public static void main(String[] args) {
        System.out.println("Chương trình thử nghiệm lớp MyComplex");

        MyComplex2 so1 = new MyComplex2(3, 4);
        MyComplex2 so2 = new MyComplex2(1, 2);

        System.out.println("Số phức 1: " + so1);
        System.out.println("Số phức 2: " + so2);

        System.out.println("Cộng hai số phức: " + so1.addNew(so2));
        System.out.println("Trừ hai số phức: " + so1.subtractNew(so2));

        so1.multiply(so2);
        System.out.println("Nhân hai số phức: " + so1);

        MyComplex2 so3 = new MyComplex2(2, 2);
        so3.divide(so2);
        System.out.println("Chia hai số phức (2+2i) / (1+2i): " + so3);

        System.out.println("Liên hợp của số phức 1: " + so1.conjugate());

        System.out.println("Độ lớn của số phức 1: " + so1.magnitude());
        System.out.println("Argument của số phức 1 (radian): " + so1.argument());

        System.out.println("Số phức 1 có phải là số thực? " + so1.isReal());
        System.out.println("Số phức 1 có phải là số thuần ảo? " + so1.isImaginary());

        MyComplex2 so4 = new MyComplex2(3, 4);
        System.out.println("Số phức 1 có bằng số phức (3+4i)? " + so1.equals(so4));
    }
    }

