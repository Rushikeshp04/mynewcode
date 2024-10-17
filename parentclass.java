package inheritance;

class grandparent{
  static void add()
  {
	  int f=45;
	  int h=34;
	  int sum=(f+h);
	  System.out.println(sum);
  } 
}
public class parentclass extends grandparent 
{
static void sub()
{
	int b=46;
	int w=50;
	int sub=(b-w);
	System.out.println(sub);
	}
}

class childclass extends parentclass
{
	static void multi()
	{
	int k=90;
	int s=32;
	int multi=(k*s);
	System.out.println(multi);
	}

public static void main (String[] args) 
{
	multi();
	sub();
	add();
}
}
