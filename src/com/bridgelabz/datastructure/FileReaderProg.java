package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileReader;

public class FileReaderProg 
{
   private static final int String.valueOf((char)i) = 0;

public static void main(String[] args)
   {
	int i=0,count=0;
	String str;
	String[] list=new String[5];
	String seperatewordFromFile="";
	
	try{
		
	File file=new File("/JavaProject/src/com/bridgelabz/datastructure/priya");
	if(file.createNewFile()){
		System.out.println("ne file is created");
	}
	else
	{
		System.out.println("file is already exit");
	}
	 FileReader reader=new  FileReader(file);
	 while((i=reader.read()))!=-1){
		 
		 //ascii value of comma=44
		 if(i==44)
		 {
			 String seperatedwordFromFile;
			list[count++]=seperatedwordFromFile;
			 seperatedwordFromFile="";
		}
		 else{
			 seperatedwordFromFile = seperatedwordFromFile + String.valueOf((char)i)
		 }
	 }
	
	}
	
}
}
