package Homework29022020;

public class ShareDigit {
	public static void main(String[] args) {
		ShareDigit sharedDigit = new ShareDigit();
		int num1,num2;
		num1=21;
		num2=32;
		System.out.println("Is Shared "+sharedDigit.hasShared(num1, num2));
		
	}
	public Boolean hasShared(int n,int m)
	{
		int temp=0;
		while(m>0)
		{
			temp = m%10;
			m=m/10;
			return check(n,temp);
		}
		return false;
	}
	public  Boolean check(int num,int digit)
	{
		int temp=0;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			if(temp==digit)
			{
				return true;
			}
			else
				return false;
		}
		return false;
	}
}
