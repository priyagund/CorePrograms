package com.bridgelabz.functional;

import com.bridgelazs.utility.Utility;

public class UserName
{
	public static void main(String[] args)
	{ 
		String str="hello Username ,how are you?";
		System.out.println("enter your name");
		String username=Utility.getStr();
		if(username.length()>3) {
		System.out.println(str.replaceAll("Username",username ));
		}
		else {
			System.out.println("invalid username");
		}
	}
}
