package forLoop;

public class StarPattern1 {

	public static void main(String[] args) 
	{
		int row=5;
		for(int i=1; i<=row; i++) //i represents row
		{
			for(int star=1; star<=i; star++) // star represents no. of stars
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
