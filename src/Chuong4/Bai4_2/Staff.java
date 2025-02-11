package Chuong4.Bai4_2;

public class Staff extends Person{

    public Staff(String name, String address) {
        super(name, address);
    }
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString() {
        return "Staff [" + super.toString() + ", School= " + school + ",Pay= " + pay +"]";
    }
}

