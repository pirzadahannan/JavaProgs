import java.util.*;

class ggg
{
	public static void main (String ar[])
	{
	int a;
	a=10;
	boolean b=true;
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.printf("*");
		}
		for(int k=0;k<(2*(9-i));k++)
		{
			System.out.printf(" ");
		}
		for(int j=0;j<i;j++)
		{
			System.out.printf("*");
		}
		System.out.printf(" \n");
	}
	
	for(int i=8;i>0;i--)
	{
		for(int j=0;j<i;j++)
		{
			System.out.printf("*");
		}
		for(int k=0;k<(2*(9-i));k++)
		{
			System.out.printf(" ");
		}
		for(int j=0;j<i;j++)
		{
			System.out.printf("*");
		}
		System.out.printf(" \n");
	}
	//mahindra logo pattern
	}
}