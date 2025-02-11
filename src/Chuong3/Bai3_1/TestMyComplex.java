package Chuong3.Bai3_1;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex = new MyComplex(0,2);
        MyComplex myComplex2 = new MyComplex(3,4);
        System.out.println(myComplex);
        System.out.println(myComplex2);

        System.out.println("Is real 1 : "+myComplex.isReal());
        System.out.println("Is imaginary 1 : "+myComplex.isImag());

        System.out.println("Real 1 : "+myComplex.getReal());
        System.out.println("Imaginary 1 : "+myComplex.getImag());

        MyComplex myComplex3 = myComplex.addNew(myComplex2);
        System.out.println("1 + 2 : "+myComplex3);

        myComplex.addInto(myComplex2);
        System.out.println("add c1.addInto(c2) : c1 = "+myComplex);

        myComplex.setReal(3);
        myComplex.setImag(4);
        System.out.println("1 equals 2 : "+myComplex.equals(myComplex2));
        System.out.println("1 equals (4,6): "+myComplex.equals(4,6));
    }
}
