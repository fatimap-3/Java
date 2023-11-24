package sem2cosc1047lab;


	import java.util.Scanner;
	public class TestProgramTimer {
	    public static void main(String[] args) {
	        Timer[] timers = new Timer[3];
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < timers.length; i++) {
	            System.out.println("Enter values for Timer " + (i + 1) + ":");
	            int hours = scanner.nextInt();
	            int minutes = scanner.nextInt();
	            int seconds = scanner.nextInt();
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

