package com.bridgelabz.dtatstructure;

import java.io.*;
import java.util.Arrays;

import com.bridgelazs.utility.Utility;

public class UnorderedLinklist<T> {
	public static void main(String[] args) throws IOException {

		LinkedList<String> list = new LinkedList<String>();
		File f = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/src/ListUnordered");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String[] str = new String[4];

		str = br.readLine().split(" ");
		//System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			list.addElement(str[i]);
		}

		list.ShowList();

		System.out.println("enter word u want to search");
		String str1 = Utility.getStr();
	     list.search(str1);
		 list.ShowList();
		
	     list.ShowList();
        
	}
}
