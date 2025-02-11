package Chuong3.Bai3_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime mt = new MyTime(12, 59, 58);
        System.out.println(mt);
        MyTime mt2 = new MyTime(23, 59, 59);
        System.out.println(mt2);
        // Test getter and setter
        MyTime mt3 = new MyTime();
        mt3.setHour(12);
        mt3.setMinute(30);
        mt3.setSecond(35);
        System.out.println(mt3);
        System.out.println("Hour: " + mt3.getHour());
        System.out.println("Minute: " + mt3.getMinute());
        System.out.println("Second: " + mt3.getSecond());
        // test next second
        System.out.println("Mt4:");
        MyTime mt4 = new MyTime(23, 59, 59);
        System.out.println("Before: " + mt4);
        mt4.nextSecond();
        System.out.println("After: " + mt4);
        // test previous second
        MyTime mt5 = new MyTime(23, 59, 59);
        System.out.println("After: " + mt5.previousSecond());
        // Test chuoi
        MyTime mt6 = new MyTime(6, 30, 30);
        // Test tang time
        System.out.println("Before: " + mt6);
        mt6.nextHour().nextMinute().nextSecond();
        System.out.println("After: " + mt6);
        // Test giam time
        mt6.previousHour().previousMinute().previousSecond();
        System.out.println("After previous: " + mt6);
        // test dk
        System.out.println("Chay dieu kien");
        MyTime mt7 = new MyTime(24, 90, 70);
        // neu sai dk hour= 23 , minute = 59 , second = 59
        System.out.println(mt7);
        // test dk getter setter
        mt7.setHour(25);
        System.out.println(mt7.getHour());
        mt7.setMinute(68);
        System.out.println(mt7.getMinute());
        mt7.setSecond(90);
        System.out.println(mt7.getSecond());
        // Tang nhieu Time
        System.out.println("Chay mt8 : ");
        MyTime mt8 = new MyTime(1,2,3);
        System.out.println("Thoi gian ban dau: "+ mt8);
        mt8.nextHour().nextHour().nextHour().nextHour().nextHour();
        mt8.nextMinute().nextMinute().nextMinute().nextMinute();
        mt8.nextSecond().nextSecond();
        System.out.println("Thoi gian sau khi duoc tang : "+ mt8);
        mt8.previousHour().previousHour().previousHour();
        mt8.previousMinute().previousMinute().previousMinute();
        mt8.previousSecond().previousSecond().previousSecond();
        System.out.println("Tang roi lai giam : "+mt8);

    }
}
