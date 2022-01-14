package main.time;

public abstract class TimeFormat {

    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void printTime(){
        System.out.println(this.hour +  ":" + this.minute);
    }

    TimeFormat(int hours, int minutes){
        setHour(hours);
        setMinute(minutes);
        dispTime();
    }
    abstract void dispTime();
}
