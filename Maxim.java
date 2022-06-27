import java.util.*;
class Maxim
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("\tEnter Number:");
	int n=sc.nextInt();
	int k=0;
	int rem=n;
	
	while(n!=0)
	{
	 rem=rem%10;
	if(rem>k)
	k=rem;
	 n=n/10;
	}
	System.out.print(" "+k);

	}
}
	
	