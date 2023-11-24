package sem2cosc1047lab;

import java.util.Scanner;

public class Timer {
    private int hours;
    private int minutes;
    private int seconds;

    public Timer() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Timer(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        this.hours = Math.max(0, hours);
    }

    public void setMinutes(int minutes) {
        this.minutes = Math.max(0, minutes);
    }

    public void setSeconds(int seconds) {
        this.seconds = Math.max(0, seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public static void main(String[] args) {
        Timer[] timers = new Timer[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < timers.length; i++) {
            System.out.println("Enter values for Timer " + (i + 1) + ":");
            int hours = input.nextInt();
            int minutes = input.nextInt();
            int seconds = input.nextInt();
            timers[i] = new Timer(hours, minutes, seconds);
        }
        
        int totalHours = 0;
        int totalMinutes = 0;
        int totalSeconds = 0;

        for (Timer timer : timers) {
            totalHours += timer.getHours();
            totalMinutes += timer.getMinutes();
            totalSeconds += timer.getSeconds();
        }

        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;
        totalHours += totalMinutes / 60;
        totalMinutes %= 60;

        System.out.println("Total time: " + totalHours + " hours, " + totalMinutes + " minutes, " + totalSeconds + " seconds");
    }
}

