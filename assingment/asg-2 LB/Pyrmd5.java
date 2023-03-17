 class Pyrmd5{

	public static void main (String args[])
	{
	
		for(int i=9;i>=1;i--)
		{
			for(int k=2;k<=i;k++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=9;j++ )			
			{
				System.out.print(j+" ");
			}	
		
			for(int m=8;m>=i;m-- )			
			{
				System.out.print(m+" ");
			}
		
	    System.out.println();
		}
	}
 }
 
 //OUTPUT:-
 
 /*
 F:\java>java Pyrmd5
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/