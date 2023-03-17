 class Pyrmd4{

public static void main (String args[])
{
	
	for(int i=0;i<=8;i++)
	{
		for(int k=7;k>=i;k--)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i+1;j++ )			
		{
			System.out.print(j+" ");
	
		}	
		
		for(int m=i;m>0;m-- )			
		{
		
			System.out.print(m+" ");
		}
			System.out.println();

        }
}
}

//OUTPUT:-

/*

F:\java>java Pyrmd4
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
