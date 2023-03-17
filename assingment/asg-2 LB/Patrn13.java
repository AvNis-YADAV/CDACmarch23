public class Patrn13{

public static void main (String args[])
{
	for(int i=65;i<=69;i++)
	{
		
			for(int k=i+1;k<=69;k++)
			{
				System.out.print(" ");

			}
			for(int j=65;j<=i;j++ )
				{
				System.out.print((char)i+" ");
				}

			System.out.println();
			
	}
}
}

//OUTPUT:-

/*

F:\java>java Patrn13
    A
   B B
  C C C
 D D D D
E E E E E
*/