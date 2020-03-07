package Homework29022020;

public class SumOfEvenDigit {

	public static void main(String[] args) {
		int no=12345;
		int d=0;
		int sum=0;
		while(no>0)
		{
			d = no%10;
			System.out.println(d);
			no = no/10;
			if(d%2==0)
			{
				sum = d+sum;
			}
		}
		System.out.println("Sum of even no is="+sum);
	}
}
