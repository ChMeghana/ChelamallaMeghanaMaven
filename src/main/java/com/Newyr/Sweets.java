package com.Newyr;
import java.util.*;
public class Sweets {

	Scanner sc=new Scanner(System.in);
	public static int count=0;
	public void sweet()
	{
		System.out.println("How many sweets you want?...");
		int s;
		s=sc.nextInt();
		count+=s;
		for(int i=1;i<=s;i++)
		System.out.println("Sweet"+i);
	}
	public void gifty()
	{
		
		System.out.println("###### Giftssss ######");
	}
}
