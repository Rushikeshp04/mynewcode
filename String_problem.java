import java.util.Arrays; 
public class String_problem {
static int k=0;
	//reverse the string
 public static void main(String[] args) {
	int rollno []= {23,67,45,78,};
	int rollno_reverse[]= new int[rollno.length];
	for (int i=rollno.length-1;i>=0;i--)

 {
	rollno_reverse[i]    =rollno[k];
	k++;
 }
	System.out.println(Arrays.toString(rollno));	
	System.out.println(Arrays.toString(rollno_reverse));	
 }
}

