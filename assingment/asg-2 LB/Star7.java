public class Star7{

public static void main (String args[])
{
    for(int i=0;i<=3;i++)
	{
		for(int k=i;k<4;k++)
		{
			System.out.print(" ");
		
		}
		for(int j=(2*i)+1;j>0;j--)
		{	
			System.out.print("*");

		}
		System.out.println();
    }
	
	for(int i=4;i>=0;i--)
	{
		for (int k=i;k<=3;k++)
			System.out.print(" ");
		for(int j=2*i+1;j>=1;j--)			
		{
				System.out.print("*");

		}
		

			System.out.println();
	}
}
}

//OUTPUT:-

/*

F:\java>java Star7
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
	
*/