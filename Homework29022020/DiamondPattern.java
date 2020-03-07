package Homework29022020;

public class DiamondPattern
{

	public static void main(String[] args) {
		int no=7;
		int space=no-1;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int f=1;f<=i*2-1;f++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(int i=1;i<=no-1;i++)
		{
			for(int j=1;j<=space;j++)
			{
			System.out.print(" ");
			}
			space++;
			for(int f = 1; f < 2 * (no - i) - 1; f++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
