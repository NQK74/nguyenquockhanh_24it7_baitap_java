package Chuong4.Bai4_1;

public class TestCylinder {
    public static void main(String[] args) {
        // Khai báo và phân bổ một thể hiện mới của hình trụ
        // với màu sắc, bán kính và chiều cao mặc định
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder : "+ " Radius= " + cylinder.getRadius()
        + " height= " + cylinder.getHeight()+" base area= "+cylinder.getArea()
        + " volume="+cylinder.getVolume());
        // Khai báo và phân bổ một thể hiện mới của hình trụ
        // chỉ định chiều cao, với màu sắc và bán kính mặc định
        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder2 : "+ " Radius= " + cylinder2.getRadius()
        + " height= " +  cylinder2.getHeight()+" base area= "+cylinder2.getArea()
        + " volume="+cylinder2.getVolume());

        // Khai báo và phân bổ một thể hiện mới của hình trụ
        // chỉ định bán kính và chiều cao, với màu mặc định
        Cylinder cylinder3 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder3 : "+ " radius= " + cylinder3.getRadius()
        + " height= "+cylinder3.getHeight()+" base area= "+cylinder3.getArea()
        + " volume= "+cylinder3.getVolume());
    }
}
