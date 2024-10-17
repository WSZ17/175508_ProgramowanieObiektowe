package Zad8;

public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time addTime(Time otherTime){
        int min = this.minutes + otherTime.minutes;
        int hour = this.hours + otherTime.hours;
        if(min > 59){
            min -= 60;
            hour += 1;
        }
        if(hour > 23) {
            hour -= 24;
        }
        return new Time(hour,min);
    }

    public static void main(String[] args){
        Time time1 = new Time(23,59);
        Time time2 = new Time(0,1);
        Time time3 = time1.addTime(time2);
        System.out.println(time1.hours + ":" + time1.minutes);
        System.out.println(time2.hours + ":" + time2.minutes);
        System.out.println(time3.hours + ":" + time3.minutes);
    }
}
