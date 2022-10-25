package AlarmClock;

public class AlarmClock {
    private int snoozeInterval = 99;
    private int oldValue;


    public void setSnoozeInterval(int snoozeInterval) {


        oldValue = this.snoozeInterval;
        System.out.println("Old snooze :" + oldValue);


        System.out.println("New snooze : " + this.snoozeInterval);
    }


    public void anotherMethod() {
        System.out.println("old value in another method = " + oldValue);
    }


    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    @Override
    public String toString() {
        return "some string";
    }


}