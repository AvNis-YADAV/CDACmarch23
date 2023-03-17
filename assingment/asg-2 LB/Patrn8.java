import java.util.Scanner;
public class Patrn8{

public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Integer value for n:-");
int n= sc.nextInt();
	for(int i=n;i>=1;i--)
	{
		
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");

			}
			for(int j=i;j<=n;j++ )
				{
				System.out.print(j+" ");
				}

			System.out.println();
	}
}

}

//OUTPUT:-

/*
F:\java>java Patrn8
Enter Integer value for n:-
5
     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
 
*/