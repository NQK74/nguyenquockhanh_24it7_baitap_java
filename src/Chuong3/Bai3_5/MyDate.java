package Chuong3.Bai3_5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public String[] MONTHS = {"Jan","Fed","Mar","Apr","May","Jun",
            "Jul","Aug","Sep","Oct","Nov","Dec"};
    public String[] DAYS = {"Sunday","Monday","Tuesday","Wednesday",
            "Thursday","Friday","Saturday"};
    public int[] DAYSINMOTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) return false;
        if (month < 1 || month > 12) return false;
        int maxDay = DAYSINMOTHS[month  -1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return (day >= 1 && day <= maxDay);
    }
    public int getDayOfWeek(int year, int month, int day) {
        LocalDate Date = LocalDate.of(year, month, day);
        return Date.getDayOfWeek().getValue() % 7;

    }
    public MyDate(int year, int month, int day) {
        if(!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, day");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month, int day) {
        if(!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, day");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setYear(int year) {
        setDate(year, month, day);
        this.year = year;
    }
    public void setMonth(int month) {
        setDate(month, month, day);
        this.month = month;
    }
    public void setDay(int day) {
        setDate(month, day, day);
        this.day = day;
    }
    public String toString() {
        return "\""+DAYS[getDayOfWeek(year, month, day)]+ " " + day + " " + MONTHS[month -1] + " " + year + "\"";
    }
    public MyDate nextDay(){
        int maxDay = DAYSINMOTHS[month-1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        if (day < maxDay){
            return new MyDate(year, month, day+1);
        }
        else if (month < 12 ){
            return new MyDate(year, month + 1,1);
        }
        else {
            return new MyDate(year + 1 , 1 , 1);
        }
    }
    public MyDate nextMonth(){
        if (month < 12 ){
            // Kiểm tra ngày hợp lệ cho tháng tiếp theo
            int maxDay = DAYSINMOTHS[month];
            if (month + 1 == 2 && isLeapYear(year)) {
               maxDay = 29;}

//           else {
//               maxDay = DAYSINMOTHS[month];
//           }
//           // Điều chỉnh ngày nếu số ngày vượt quas tháng tiếp theo
//            int newDay = (day > maxDay) ? maxDay : day;
//           return new MyDate(year, month + 1, newDay);
//        }
//        else {
//            return new MyDate(year + 1 , 1 , day);
//        }
        int newDay = Math.min(day, maxDay);
            return new MyDate(year, month + 1, newDay);
        }
        else {
            int newDay = Math.min(day , DAYSINMOTHS[0]);
            return new MyDate(year +1,  1, newDay);
        }
    }
    public MyDate nextYear(){
        // Xử lý  năm nhuận 29/2
        if(month == 2 && day == 29 && isLeapYear(year +1)) {
            return new MyDate(year + 1 , 2,28);
        }
        return new MyDate(year + 1, month, day);
    }
    public MyDate previousDay(){
        if(day > 1 ){
            return new MyDate(year, month, day - 1);
        }
        else{
            if (month > 1){
                int prevMonth = month-1;
                int maxDay = DAYSINMOTHS[prevMonth - 1];
                if (prevMonth == 2 && isLeapYear(year)) {
                    maxDay = 29;
                }
                return new MyDate(year, prevMonth, maxDay);
            }
            else {
                return new MyDate(year - 1 , 12 , 31);
            }
        }
    }
    public MyDate previousMonth(){
        if (month > 1){
            // Kiểm tra ngày hợp lệ cho tháng trước
            int maxDay = DAYSINMOTHS[month-2];
            if (month - 1 == 2 && isLeapYear(year)) {
                maxDay = 29;
            }
            // Điều chỉnh ngày nếu vượt quá ngày của tháng trước
//            int newDay = (day > maxDay) ? maxDay : day;
//            return new MyDate(year, month - 1, newDay);
            int newDay = Math.min(day, maxDay);
            return new MyDate(year, month - 1, newDay);
        }
        else{
            int newDay = Math.min(day , DAYSINMOTHS[11]);
            return new MyDate(year - 1 , 12 , newDay);
        }
    }
    public MyDate previousYear(){
        // Xử lý năm nhuận 29/2
        if(month == 2 && day == 29 && !isLeapYear(year)) {
            return new MyDate(year - 1 , 2,28);
        }
        return new MyDate(year - 1 , month , day);
    }


}
