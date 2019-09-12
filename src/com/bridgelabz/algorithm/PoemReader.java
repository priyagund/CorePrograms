package com.bridgelabz.algorithm;

public class PoemReader 
{
	public static void main(String[] args)
	{
		
		String str= "Old MacDonald had a farm,\n"+
				"E­I­E­I­O.\n"+
				"a"+
				"And on his farm he had some %ANIMAL%,\n"+
				"E­I­E­I­O.\n"+
				"a\n"+
				"With a %SOUND%, %SOUND% here,\n"+
				"And a %SOUND%, %SOUND% there,\n"+
				"Here a %SOUND%, there a %SOUND%,\n"+
				"Everywhere a %SOUND%, %SOUND%,\n";
	
		String[] arr1 = {"chicks", "Duck - quack","Turkey","cat","mule","dog","turtle","cow"};
		String[] arr2 = {"chick", "quack","gobble","meow,meow","heehaw","bow bow","nerp nerp","moo moo"};
	
	
	for(int i=0;i<arr1.length;i++) 
	{
	
		
		String s1 = str.replace("%ANIMAL%",arr1[i]);
		String s2 = s1.replace("%SOUND%",arr2[i] );
		System.out.println(s2);
	}
	
}
}
