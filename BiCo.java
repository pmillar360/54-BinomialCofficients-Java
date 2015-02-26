import java.util.*;
import java.lang.*;

class BiCo {
	private final int n;
	private final int k;
	private int ans;

	public BiCo(int n, int k) {
		this.n = n;
		this.k = k;

		if(n<k)
		{
			int temp = n;
			n=k;
			k=temp;
		}
		 
		this.ans = calc(n,k);
	}

	public int calc(int n, int k)
	{

		int a = factorial(n);
		int b = factorial(n-k);
		int c = factorial(k);
		ans = a/(b*c);
		return ans;
	}

	public int factorial(int t)
	{
		if(t<=1)
		{
			return 1;
		}
		return t*factorial(t-1);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value n");
		int n = sc.nextInt();
		System.out.println("Enter value k");
		int k = sc.nextInt();

		BiCo bc = new BiCo(n,k);
		System.out.println("The binomial coefficient is "+bc.ans);
	}

}