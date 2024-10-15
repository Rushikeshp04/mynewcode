
public class Averagearrays {
	public static void main(String[]args) 
	{
		int no[]= new int[5];
		no[0]= 45;
		no[1]= 56;
		no[2]= 23;
		no[3]= 89;
		no[4]= 89;
		
		int sum=0;
		double average=0;
	
		for (int b=0;b<no.length;b++)
		{
	
			
			sum= sum+no[b];
		}
	System.out.println(sum);
	
	
average=sum/no.length;
System.out.println(average);
	}
	}
