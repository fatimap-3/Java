
public class Divisibility 
{
   public static void main(String[] args) 
	{ 
	   int count=0;
	   for(int i=100;i<=1000;i++)
			{
			if(i%3 == 0 && i%4 ==0)
			{
			System.out.print(i + " ");
			count++;
		if(count==10)
		{
			System.out.println();
		    count = 0;
		}
			}
			}
	}
}

