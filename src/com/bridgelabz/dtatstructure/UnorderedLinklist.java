/******************************************************************************
* 
 Purpose: UnorderedLinkList 
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   12-09-2019
*
******************************************************************************/
package com.bridgelabz.dtatstructure;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;

import com.bridgelazs.utility.Utility;

public class UnorderedLinklist<T> {
	public static void main(String[] args) throws IOException {

		LinkedList<String> list = new LinkedList<String>();
		File f = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/src/File/ListUnordered");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String[] str = new String[4];

		str = br.readLine().split(" ");
		br.close();
		// System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			list.addElement(str[i]);
		}

		list.ShowList();

		System.out.println("enter word u want to search");
		String str1 = Utility.getStr();
		list.search(str1);
		list.ShowList();

		// list.ShowList();

		// for writting data in file

		File f1 = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/src/File/Unorderedwrite");
		System.out.println("write data into the file");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write(list.ShowList());
		bf.close();
		//list.ShowList();

		System.out.println( "all operation are done");
	}

}
