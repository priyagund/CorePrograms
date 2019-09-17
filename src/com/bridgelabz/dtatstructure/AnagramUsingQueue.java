package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class AnagramUsingQueue
{
	public static void main(String[] args)
	{
		QueueLinkList<Integer> queue=new QueueLinkList<Integer>();
		for(int i=0;i<1000;i++) 
		{
			if(Utility.isPrime(i)) 
			{
				for(int j=0;j<1000;j++)
				{
					if(Utility.isPrime(j))
					{
						if(Utility.isAnagramCheck(i, j))
						{
							queue.enQueue(i);
						}
					}
				}
			}
			
			
		}
		
		queue.showQueue();
		
	}

}
