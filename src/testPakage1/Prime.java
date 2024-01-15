package testPakage1;

public class Prime 
{

	//program for to fin weather given no. is prime or not
	public static void main(String[] args)
	{
		int i,m=0,flag=0;      
		  int num=20;    //it is the number to be checked       //3  divisible by 1 and 3
		                                                        // 10  divisable by 1, 2, 5,10
		  m=num/2;      
		  if(num==0||num==1)
		  {  
		   System.out.println(num+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;  i<=m;  i++)
		   {      
		    if(num%i==0)
		    {      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0) 
		   {
			   System.out.println(num+" is prime number");
		   }  
		  }//end of else  
		}    
		  

	}


