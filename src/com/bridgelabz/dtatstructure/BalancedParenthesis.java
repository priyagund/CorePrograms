package com.bridgelabz.dtatstructure;

import java.io.File;

import com.bridgelazs.utility.Utility;

public class BalancedParenthesis
{
	StackUsinLink  stack=new StackUsinLink();
     //Stack<String> stack=new Stack<String>();
	
 public static void main(String[] args)
 {
    String expression;
    int data;
    int N=Utility.getInt();
	int[]stack=new int[N];
	
    System.out.println("take expression ");
    expression=Utility.getStr();
    char[] ch=expression.toCharArray();
    System.out.println("expression for checking");
    
    for(int i=0;i<ch.length;i++) {
    	System.out.print(ch[i]);
    	
        if(ch[i]=='(')
        {
        	stack.push(data);
        }
        else if(ch[i]==')') 
        {
        	stack.pop();
        }
        
        
     }
   }
}
