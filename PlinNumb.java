import java.util.*;
class PlinNumb
{
		public static void main(String[]args)
	{
		 int sum=0;
		 int rem;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Amstrong number");
		 int n=sc.nextInt();
		
		int i=n;
		while(i!=0)
		{
			rem=i%10;
			sum=(sum*10)+rem;
			i=i/10;
		}
		if(sum==n)
		{
			System.out.println("Palindrom number");
		}
		else		
		{
			System.out.println("Not a palindrom");
		}
	}
}
		