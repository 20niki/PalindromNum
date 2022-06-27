class Finding
{	
	public static void main(String[]args)
	{
	int n=34567812;
	int rem=0;
	int c=0;
	int k=7;
	int i=n;
	while(n!=0)
	{
	 rem=rem%10;
	 i=i/10;
	if(rem==k)
	{
	 c=1;
	 break;
	}
	}
	
	if(c==1)
	{
		System.out.println("Number found");
	}
	else
	{
		System.out.println("Number NOT found");
	}
	}
}