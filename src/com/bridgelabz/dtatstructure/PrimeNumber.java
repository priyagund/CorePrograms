package com.bridgelabz.dtatstructure;

public class PrimeNumber 
{
public static void main(String[] args) {
		
		System.out.println("Enter range of prime number : ");
	    //int length=Utility.scanInt();
		
      int i,j,p=0;
      int[] array=new int[1000];
      int number=0;
		for(i=0;i<=1000;i++)
		{
			  number=i;
			for(j=2;j<number;j++)
			{
				if(number%j==0)
					break;
				
			}
			if(j==number)
			{
				array[p]=number;
				p=p+1;
			}
		}
		int l=0;
		int h=0;
		int s=100;
		int m=0;
		System.out.println("length : "+l);
		
		//printing prime number in row
		for(int k=0;k<=1000;k++)
		{
			for(m=h;m<s;m++) {
				
				if(array[l]>=h && array[l]<s)
				{
			       System.out.print(array[l]+" ");
			       l=l+1;
				}
				
			}
			if(m==s) 
			{
				h=m+1;
				s=m+100;
				if(s==1100)
				{
					break;
				}
			}
			System.out.println();
		}
	       

	}



	
}

