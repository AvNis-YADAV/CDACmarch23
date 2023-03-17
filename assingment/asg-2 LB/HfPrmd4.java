public class HfPrmd4{

public static void main (String args[])
{
	for(int i=1;i<=6;i++)
	{
		
			for(int k=i+1;k<=6;k++)
			{
				System.out.print("  ");

			}
			for(int j=1;j<=i;j++ )
				{
				System.out.print("*   ");
				}

			System.out.println();
	}
	
}
}

//OUTPUT:-

/*


F:\java>java HfPrmd4
          *
        *   *
      *   *   *
    *   *   *   *
  *   *   *   *   *
*   *   *   *   *   *



*/