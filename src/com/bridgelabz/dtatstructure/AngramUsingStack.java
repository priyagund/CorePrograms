package com.bridgelabz.dtatstructure;

import com.bridgelazs.utility.Utility;

public class AngramUsingStack 
{
  public static void main(String[] args)
  {   int start=0;
      int end=1000;
	  StackUsinLink<Integer> stack=new StackUsinLink<Integer>();
	  StackUsinLink<Integer> stack1=new StackUsinLink<Integer>();
      
	  for (int i = start; i <= end; i++) {
				if (Utility.isPrime(i)) 
				{
					for (int j= i+ 1; j < end; j++)
					{
						if (Utility.isPrime(j)) 
						{
							if (Utility.isAnagramCheck(i, j)){
	                            stack.push(i);
								
							    }
						}
					}
			
				}
	         }
  
      int size=stack.size();
      
      for(int i=0;i<size;i++)
      {
    	  stack1.push(stack.pop());
    	  
      }
    		stack1.stackshow();;  
  
  }
  
}