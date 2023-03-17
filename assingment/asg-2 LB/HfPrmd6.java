public class HfPrmd6{

public static void main (String args[])
{
	for(int i=6;i>=1;i--)
    {
		for(int j=1;j<=i;j++ )
		{
			if(i==1||i==j)
				System.out.print(" * ");
			else
				System.out.print("   ");
			

		}
		for(int k=5;k>=i;k-- )
		{
			if(i==1||i==k)
				System.out.print(" * ");
			else
				System.out.print("   ");
			

		}
		
		System.out.println( );
	}
}
}
	