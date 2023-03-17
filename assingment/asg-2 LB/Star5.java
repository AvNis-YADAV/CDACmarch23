public class Star5{

public static void main (String args[])
{
	
	for(int i=0;i<=4;i++)
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
}
}

//OUTPUT:-

/*

F:\java>java Star5
    *
   ***
  *****
 *******
*********

*/