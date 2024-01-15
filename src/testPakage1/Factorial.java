package testPakage1;

public class Factorial {

	public static void main(String[] args) 
	{
		int num=5, i, factorial=1;
		for(i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial is  "+factorial);

	}

}
