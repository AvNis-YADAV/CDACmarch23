import java.util.Scanner;
 class Patrn11{

public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Integer value for (n+1)th rows:-");
int n= sc.nextInt();


	for(int i=0;i<=n;i++)
	{
		for(int k=i;k<n;k++)
		{
			System.out.print(" ");
		
		}
		for(int j=(2*i)+1;j>0;j--)
		{	
			System.out.print("*");

		}

			System.out.println();
	}
}
 }

//OUTPUT:-
/*

F:\java>java Patrn11
Enter Integer value for (n+1)th rows:-
4
    *
   ***
  *****
 *******
*********

F:\java>


*/