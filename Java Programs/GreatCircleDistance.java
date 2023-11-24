import java.util.Scanner;
public class GreatCircleDistance 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of latitude of point x1 and longitude of point y1");
		double x1= input.nextDouble();
		double y1 = input.nextDouble();
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		System.out.println("Enter the value of longitude of point x2 and longitude of point y2");
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		double radiusEarth = 6371.01;
		double d = radiusEarth * Math.acos(Math.sin(x1))*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2);
		System.out.println("The Great Circle Distance is " + d +"km");
}
}