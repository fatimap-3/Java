package assignment1cosc1046;

public class AvgSpeed
{   
	public static void main(String[] args) 
	{ 
		int distance = 15; // this distance is in KM
	  double distinMiles = distance/1.6 ;
	  double time = 50.5;
	  double timeinHrs = 50.0/60;
	  double avgspeed = distinMiles/timeinHrs ;
      System.out.println("The average speed of the runner in miles per hour is " + avgspeed); 
	}
}
