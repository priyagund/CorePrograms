package com.bridgelabz.dtatstructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelazs.utility.Utility;

public class Orderedlist {
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> list = new LinkedList<Integer>();
		File f = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/orderedfile");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int i = 0;
		String str = br.readLine();
		String[] strArr = str.split(" ");

		int[] item = new int[strArr.length];
		for (int j = 0; j < item.length; j++) {
			item[j] = Integer.parseInt(strArr[j]);
		}

		for (i = 0; i < item.length; i++)
		{
			//System.out.print(item[i]+" ");
			 list.addElement(item[i]);
		}
		 list.ShowList();
		 System.out.println("sorted list is");
		 list.sortList();
		 list.ShowList();
	    System.out.println("enter number you want to find");
          int number=Utility.getInt();
          list.search(number);
          list.ShowList();
	}
}
