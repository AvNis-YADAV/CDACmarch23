public class HfPrmd5{

public static void main (String args[])
{
	
	for(int i=1;i<=6;i++)
	{
		for(int k=2;k<=i;k++)
		{
			System.out.print("  ");
		}
		for(int j=6;j>=i;j-- )			
		{
			System.out.print("*   ");
		}
			System.out.println();
	}
}
}

//OUTPUT:-

/*

F:\java>java HfPrmd5
*   *   *   *   *   *
  *   *   *   *   *
    *   *   *   *
      *   *   *
        *   *
          *
		  
		  
*/