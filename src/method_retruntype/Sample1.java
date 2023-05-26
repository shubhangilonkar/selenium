package method_retruntype;

public class Sample1 
{
public static void main(String[] args) 
{
	int num1=addition(10,20);
	System.out.println(num1);
	
	System.out.println(addition(20, 30));
	System.out.println("-----------------");
	Sample1 s1=new Sample1();
	int num2=s1.mult(7, 6);
	System.out.println(num2);
	
	System.out.println(s1.mult(8,9));
	System.out.println("-----------------");
	String s3= Sample2.converttoUppercase("shubhangi");
	System.out.println(s3);
	
}
	
	
public static int addition(int a,int b) 
{
	int c=a+b;
	return c;
}
	public int mult(int c,int d) 
	{
		int a=c*d;
		return a;
	}
	
}
