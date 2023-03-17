import java.util.Scanner;
public class Patrn6{

public static void main (String args[])
{
	/*for(int i=1 ; i<=5 ; i++) 
	{
			for(int j=5 ; j>=1 ; j--)                                                        
			{                                        
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
//OUTPUT:-			

			
	}*/
Scanner sc= new Scanner(System.in);
System.out.println("Enter Integer value for n:-");
int n= sc.nextInt();
	
	
	for(int i=1;i<=5;i++)
	{
		
			//for(int k=i+1;k<=5;k++)
			for(int k=4;k>=i;k--)
			{
				System.out.print("  ");
				//System.out.print(" ");

			}
			for(int j=1;j<=i;j++ )
				{
				System.out.print("* ");
				//System.out.print("*");
				}

			System.out.println();
	}
}
}
 
