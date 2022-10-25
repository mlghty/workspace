package AlarmClock;

public class alarm_clock {
    int snoozeInterval = 99;
    int oldValue;


    public void setSnoozeInterval(int snoozeInterval) {

        int oldValueLocal = this.snoozeInterval;
        this.snoozeInterval = snoozeInterval;
        System.out.println("oLD = " + oldValueLocal + " new " + snoozeInterval);
    }


    public void anotherMethod(){
        System.out.println("old value in another method = " + oldValue);
    }



    public int getSnoozeInterval() {
        return snoozeInterval;
    }




}


class Main {
    public static void  main(String[] args){
        alarm_clock alarmClock = new alarm_clock();
        alarmClock.setSnoozeInterval(5);

    }
}