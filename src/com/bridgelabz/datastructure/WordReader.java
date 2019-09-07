package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordReader 
{

public static int binarySearchString(String[] string, String search)
	{
		for(int i=0;i<=string.length-1;i++)
		{
			System.out.println(string[i]);
		}
			int firstindex= 0;
			int lastindex=string.length-1;
			while(firstindex<=lastindex) 
			{
				int mid=firstindex+(lastindex-firstindex)/2;
				int result=search.compareTo(string[mid]);
				if(result==0)
			return mid;
				if(result>0)
				{
					firstindex=mid+1;
		
				}
				else 
				{
					lastindex=mid-1;
		
				}
	
			}
			return -1;
	}  

			public static void main(String[] args) throws IOException {
				Scanner scanner=new Scanner(System.in);
				try {
					@SuppressWarnings("resource")
					BufferedReader objReader=new BufferedReader( new FileReader("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/src/WordRead"));
					StringBuilder sb = new StringBuilder();
					String line = objReader.readLine();
					while (line != null) {
				            sb.append(line);
				            line = objReader.readLine();
				    }
				    System.out.println(sb.toString());
				    System.out.println("Enter the want you want to search in the string");
				    String search=scanner.nextLine();
				    String string=sb.toString();
				    String[] stringArray=string.split(",");
					Arrays.sort(stringArray);
				    int result=binarySearchString(stringArray,search);
				    if(result==-1) {
				    	System.out.println("\nString is not found");
				    }
				    else
				    	System.out.println("\nString found at "+(result+1)+" position");
				}
		        catch (Exception e) {
		            System.out.println(e);
		        }
				scanner.close();
			}

		}

