package com.bridgelabz.algorithm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class PoemFromFileReader
{
  public static void main(String[] args) throws Exception
  {
  File file=new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/src/PoemRead");
       Scanner scanner=new Scanner(file);
       String str="";
  while(scanner.hasNextLine()) {
 
  str=str+"\n"+scanner.nextLine();
  }
  String[] arr1 = {"chicks", "Duck - quack","Turkey","cat","mule","dog","turtle","cow"};
String[] arr2 = {"chick", "quack","gobble","meow meow","heehaw","bow bow","nerp nerp","moo moo"};


for(int i=0;i<arr1.length;i++)
{


String s1 = str.replace("%ANIMAL%",arr1[i]);
String s2 = s1.replace("%SOUND%",arr2[i] );
System.out.println(s2);
}
}
}

