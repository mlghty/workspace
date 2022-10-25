package AlarmClock;

public class AlarmClock {


    int snoozeInterval = 99;

    public int getSnoozeInterval() {
        return snoozeInterval;
    }


    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

    public String toString(){
        return toString();
    }
}


class Main{
    public static void main(String[] args){
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setSnoozeInterval(55);
        System.out.println(alarmClock);
    }
}