import java.util.*;
class Facto
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\tEnter Number:");
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	while(n>=i)
	{
	fact=fact*i;
	i++;
	}
	System.out.print("Fctorial is:"+fact);

	}
}
	
	