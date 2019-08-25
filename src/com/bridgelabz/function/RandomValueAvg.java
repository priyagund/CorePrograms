package com.bridgelabz.function;

public class RandomValueAvg {

	public static void main(String[] args) {

		double[] arr = new double[5];
		double total = 0;

		for (int j = 0; j < 5; j++) {
			arr[j] = Math.random();
			total = total + arr[j];

		}
		System.out.println("random five value is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("average of five random number is " + (total / arr.length));
		double maxnumber = 0,minNumber=0;

		for (int i = 0; i < arr.length; i++) {
			if (maxnumber == 0 || minNumber==0) {
				maxnumber = Math.max(arr[i], arr[i+1]);
				minNumber=Math.min(arr[i],arr[i+1]);
				i++;
			}
			else {
				maxnumber = Math.max(maxnumber, arr[i]);
				minNumber=Math.min(minNumber, arr[i]);
			}

		}
		System.out.println("max number is "+maxnumber);
		System.out.println("min number is "+minNumber);


	}

}