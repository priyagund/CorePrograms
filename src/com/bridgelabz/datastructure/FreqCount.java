package com.bridgelabz.datastructure;

public class FreqCount 
{
	public static void insertionSort(String[] array, int size) {
		 
		 String temp;
		 int p;
		 for(int i=0;i<size;i++){
		 p=i;
		 for(int j=i+1;j>=0;j--){  
		if(j<size && p>=0)
		 if(array[p].compareTo(array[j])>0){
		 temp = array[p];
		 array[p]=array[j];
		 array[j]=temp;
		 }
		p=p-1;
		 }
		 }
		}


	
	
	public static void main(String[] args) {

	int size, i;

	   String[] arr= {"To","Be","Or","Not","To","Be"};
	   size=arr.length;
	   System.out.println("UnSorted array is : ");
	   for(i=0; i<size-1; i++)
	      {
	      System.out.print( arr[i]+" ");
	      }
	     insertionSort(arr, size);
	  System.out.println("");
	  System.out.println("");
	      System.out.print("Array after Sorting is : \n");
	      for(i=0; i<size; i++)
	      {
	          System.out.print(arr[i] + "  ");
	      }
	       int count;
	       System.out.println("");
	       System.out.println("count");
	      for(int p=0;p<size;p++)
	      {
	      count=0;
	      for(int k=0;k<size;k++)
	      {
	      if(arr[p].equals(arr[k])){
	      count++;
	    // System.out.print(count);
	      }
	      }
	      System.out.println(arr[p]+" : count : "+count);
	      }
	}

}
