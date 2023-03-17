class Star16{

public static void main (String args[])
{

	for(int i=1;i<=5;i++) 
	{
		for(int j=5;j>=1;j-- ) 
		{
			if((j==1)||(i==5)||(i==j))
			System.out.print("*");
		    else
			System.out.print(" ");
		}
			System.out.println();
	}
	
}
}

//OUTPUT:-

/*

F:\java>java Star16
    *
   **
  * *
 *  *
*****

*/