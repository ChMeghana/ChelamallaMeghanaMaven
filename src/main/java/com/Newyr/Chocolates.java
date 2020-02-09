package com.Newyr;
public class Chocolates extends Sweets{

	public void choco() {
		System.out.println("No.of chocolates you want?....");
		int c=sc.nextInt();
		count+=c;
		for(int i=0;i<c;i++)
		{
			System.out.println("Choco"+i);}
	}
	public void gifty()
	{
		System.out.println("*********Surprise**********");
	}
}
