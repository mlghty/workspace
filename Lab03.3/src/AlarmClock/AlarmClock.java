package AlarmClock;

public class AlarmClock {
    int snoozeInterval = 99;
    int oldValue;


    public AlarmClock() {
    }

    public AlarmClock(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

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