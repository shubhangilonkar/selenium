package method_retruntype;

public class Sample3 
{
public static void main(String[] args) 
{
	int num1=add(12,23);
	System.out.println(num1);             //1st approch

	System.out.println(add(10,20));            //2nd approch
	System.out.println("----------------------------");
	Sample3 s1=new Sample3();
int num2=s1.multi(5, 7);
System.out.println(num2);

System.out.println(s1.multi(3, 5));
   
	System.out.println("---------------");
	String s3=Sample4.converttoUppercase("pradip");
	System.out.println(s3);
	
	System.out.println(Sample4.converttoUppercase("shubhangi"));
	
}


public static int add(int a,int b)
{
	int c=a+b;
	return c;
}

public int multi(int a,int b) 
{
	int c=a*b;
	return c;
}








}
