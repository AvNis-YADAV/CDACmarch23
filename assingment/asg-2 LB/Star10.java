 class Star10{

public static void main (String args[])
{

	for(int i=1;i<=5;i++) 
	{
		for(int j=4;j>=i;j-- ) 
		{
			System.out.print(" ");
		}
		for(int j=5;j>=1;j-- ) 
		{
			System.out.print("*");
		}
			System.out.println();
	}
	
}
}

//OUTPUT:-

/*

F:\java>java Star10
    *****
   *****
  *****
 *****
*****

*/