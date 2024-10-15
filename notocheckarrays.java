
public class notocheckarrays {
static int no_to_check=15;
	public static void main(String[]args) 
	{
		int rollno[]= {15,45,67,34,89};
		
		int no_to_check=15;
		for (int i=0;i<rollno.length;i++) 
		{
			if(no_to_check==rollno[i])
			{
				System.out.println("ok");
			}
			else 
			{
				System.out.println("not ok");
			}
		}
		
		
	}
}
