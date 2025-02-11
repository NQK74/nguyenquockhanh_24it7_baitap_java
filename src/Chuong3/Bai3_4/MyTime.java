package Chuong3.Bai3_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime(){}
    public MyTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 ) {
        this.hour = hour;}
        else {
           this.hour = 23;
        }
        if (minute >= 0 && minute <= 59) {
        this.minute = minute;}
        else {
            this.minute = 59;
        }
        if (second >= 0 && second <= 59) {
            this.second = second;}
        else {
            this.second = 59;
        }
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23 ) {
            this.hour = hour;}
        else {
            this.hour = 23;
        }
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;}
        else {
            this.minute = 59;
        }
    }
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;}
        else {
            this.second = 59;
        }
    }
    public String toString() {
        return String.format("%02d:%02d:%02d",hour , minute , second);
    }
    public MyTime nextSecond() {
        second++;
        if (second == 60){
            second = 0;
            minute++;
            if (minute == 60)
                minute = 0;
            hour++;
            if (hour == 24)
                hour = 0;}
            return this;
    }
    public MyTime nextMinute() {
        minute++;
        if (minute == 60){
            minute = 0;
        hour++;}
        return this;
    }
    public MyTime nextHour() {
        hour++;
        if(hour == 24){
            hour = 0;}
        return this;
    }
    public MyTime previousSecond() {
        second--;
        if (second == -1){
            second = 59;
            minute--;
            if (minute == -1){
                minute = 59;
                hour--;
                if (hour == -1){
                    hour = 23;
                }
            }
        }
        return this;
    }
    public MyTime previousMinute() {
        minute--;
        if (minute == -1){
            minute = 59;
            hour--;
            if (hour == -1){
                hour = 23;
            }
        }
        return this;
    }
    public MyTime previousHour() {
        hour--;
        if (hour == -1){
            hour = 23;
        }
        return this;
    }

}
