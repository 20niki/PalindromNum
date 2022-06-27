import java.util.*;
class Pram
{
 public static void main(String[]args)
	{
	
 	
	Scanner sc=new Scanner(System.in);
 	int n=sc.nextInt();
	int i=2;
	while(i<=n)
		{
		if(n%i==0)
		break;
		i++;
		}
		if(n==i)
		{
		System.out.println("Its a prime number");
		}
		else
		{
			System.out.println("Its Not a prime number");
		}
	}
}