package testPakage1;

public class PrimeNumber2 
{

	public static void main(String[] args) 
	{
		int num=2, i, count=0;
		
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
			{
				System.out.println(num+" is Prime Number");
			}
		else
		{
			System.out.println(num+" is Not Prime Number");
	     }
	}
}

