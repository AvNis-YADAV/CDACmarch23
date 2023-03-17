public class Star14{

public static void main (String args[])
{
	for(int i=1;i<=5;i++)
	{
		for (int k=i;k>1;k--)
			System.out.print(" ");
		for(int j=5;j>=i;j-- )			
		{
				System.out.print("* ");
		}
			System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		for(int k=3;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++ )			
		{
				System.out.print("* ");
		}
			System.out.println();
	}
}
}


//OUTPUT:-

/*


F:\java>java Star14
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *


*/