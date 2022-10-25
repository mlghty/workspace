package first;

public class AlarmClock {


    public static int howmanySnoozes = 0;
    int snoozeInterval = 99;
    int oldValue;

    public static int getHowmanySnoozes() {
        return howmanySnoozes;
    }

    public void setSnoozeInterval(int snoozeInterval) {

        int oldValueLocal = this.snoozeInterval;
        this.snoozeInterval = snoozeInterval;
        System.out.println("oLD = " + oldValueLocal + " new " + snoozeInterval);
        howmanySnoozes++;
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
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setSnoozeInterval(5);
        alarmClock.setSnoozeInterval(5);
        System.out.println(alarmClock.getHowmanySnoozes());
        alarmClock.setSnoozeInterval(5);
        alarmClock.setSnoozeInterval(5);
        alarmClock.setSnoozeInterval(5);


        System.out.println(alarmClock.getHowmanySnoozes());



    }
}