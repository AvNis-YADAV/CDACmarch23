public class Patrn7{

public static void main (String args[])
{
	for(int i=1;i<=5;i++)
	{
		
			for(int k=i+1;k<=5;k++)
			{
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++ )
				{
				System.out.print(j+" ");
				}

			System.out.println();
	}
	
//OUTPUT:-			
 /* 1
   2 1
  3 2 1
 4 3 2 1
5 4 3 2 1 */
			
	}
	
	
	
	/*for(int i=1;i<=5;i++)
	{
		
			for(int k=i+1;k<=5;k++)
			{
				System.out.print("  ");

			}
			for(int j=1;j<=i;j++ )
				{
				System.out.print("* ");
				}

			System.out.println();
	}*/
}

 
