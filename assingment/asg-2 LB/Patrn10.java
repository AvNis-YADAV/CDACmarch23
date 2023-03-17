public class Patrn10{

public static void main (String args[])
{
	for(int i=69;i>=65;i--)
	{
		
			for(int k=i-1;k>=65;k--)
			{
				System.out.print(" ");

			}
			for(int j=i;j<=69;j++ )
				{
				System.out.print((char)j+" ");
				}

			System.out.println();
			
	}
}
}

//OUTPUT:-

/*
F:\java>java Patrn10
    E
   D E
  C D E
 B C D E
A B C D E

*/