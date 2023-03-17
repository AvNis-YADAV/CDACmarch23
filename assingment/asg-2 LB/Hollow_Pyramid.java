class Hollow_Pyramid
{ 
public static void main(String[] args)
{
 
for(int i=1;i<=6;i++)
{
 
    for(int j=6-i;j>0;j--) 
		{
			System.out.print(" ");
        }
		
    for(int j=1;j<=i;j++) 
		{
			if (j==1||((i==6)&&(j%2!=0)))
			{
			System.out.print("*");
             }
	
			else
			{
				System.out.print(" ");
			}	
		}
	for(int j=1;j<i;j++)
	{ 
    if(j==i-1||((i==6)&&(j%2!=0)))
	{
			System.out.print("*");
	}
    else
	{
			System.out.print(" ");
	}

	}
   System.out.println();
}

}

}

//OUTPUT:-

/*

F:\java>java Hollow_Pyramid
     *
    * *
   *   *
  *     *
 *       *
* * * * * *

*/