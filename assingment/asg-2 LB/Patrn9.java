public class Patrn9{

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
				System.out.print((char)j+" ");
				}

			System.out.println();
			
	}
}
}
//Output:-

/*
F:\java>java Patrn9
    A
   A B
  A B C
 A B C D
A B C D E

*/