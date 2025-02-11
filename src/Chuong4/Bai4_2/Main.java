package Chuong4.Bai4_2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Quoc Khanh","Quang Tri"
        , "OOP", 2024, 9530670 );
        System.out.println(s1);
        s1.setProgram("Huong doi tuong");
        s1.setYear(2028);
        s1.setFee(10000000);
        System.out.println(s1.toString());
        System.out.println("Den staff");
        Staff st1 = new Staff("Co lao cong","Da Nang",
                "VKU",1011000);
        System.out.println(st1);
    }
}
