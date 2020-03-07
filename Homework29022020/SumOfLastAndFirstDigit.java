package Homework29022020;
public class SumOfLastAndFirstDigit {
public static void main(String[] args) {
		int no=12345;
		int first=0;
		int last=no%10;
		System.out.println("last="+last);
		while(no>=10)
		{
			no = no/10;
		}
		first = no;
		System.out.println("First = "+first);
		
		System.out.println("Sum of First and Last Digit "+(first+last));
	}
}
