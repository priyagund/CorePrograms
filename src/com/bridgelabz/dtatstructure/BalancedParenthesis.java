
/******************************************************************************
* 
 Purpose:  Balance
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelabz.dtatstructure;

import java.io.File;

import com.bridgelazs.utility.Utility;

public class BalancedParenthesis {

	// Stack<String> stack=new Stack<String>();

	public static void main(String[] args) {
		StackUsinLink<Character> stack = new StackUsinLink<Character>();
		String expression;
		int data;

		// StackUsinLink stack=new StackUsinLink();
		System.out.println("take expression ");
		expression = Utility.getStr();
		char[] ch = expression.toCharArray();
		System.out.println("expression for checking");
		boolean isBalanced = false;

		for (int i = 0; i < ch.length; i++) {
			isBalanced = false;
			// System.out.print(ch[i]);

			if (ch[i] == '(') {
				stack.push(ch[i]);
			} else if (ch[i] == ')') {
				if(!stack.isEmpty()) {
					stack.pop();
					isBalanced=true;
				}
				

			}

		}
		if(stack.isEmpty()&&isBalanced)

		{
			System.out.println("Expression is balanced");
		} else {
			System.out.println("Expression is not balanced");
		}

	}
}
