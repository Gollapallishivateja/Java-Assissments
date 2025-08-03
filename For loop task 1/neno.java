package problemsloving;
public class Neon {
public static void main(String args[])
{
	int n=9;
	int sqr=n*n;
	int sum=0;
	while(sqr>0)
	{
		int dig=sqr%10;
		sum+=dig;
		sqr/=10;
	}
	if(n==sum)
	{
		System.out.println("Neno number");
	}
	else
	{
		System.out.println("Not Neno Number");
	}
}
}

