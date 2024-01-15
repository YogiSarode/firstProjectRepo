package forLoop;

public class StarPattern2 {

	public static void main(String[] args) 
	{
		int row=5;
		for(int i=1; i<=row; i++) //i represents row
		{
			for(int star=5; star>=i; star--) // star represents no. of stars
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
