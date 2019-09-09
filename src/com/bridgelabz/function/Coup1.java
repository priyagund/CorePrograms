package com.bridgelabz.function;
import java.util.*;
public class Coup1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valur of n");
		int n=sc.nextInt();
		int count=0,dist=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		Random rand=new Random();
		
//		for(int i=0;i<n;i++)
//		System.out.println(a[i]+" ");
		while(dist<n)
		{
			int x=rand.nextInt(n)+1;
			count++;
			if(a[x-1]!=0)
			{
				dist++;
				a[x-1]=0;
			}
			
		}
		
		System.out.println(count);
	}

}
