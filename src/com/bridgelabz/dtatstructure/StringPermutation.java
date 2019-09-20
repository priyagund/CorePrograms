package com.bridgelabz.dtatstructure;

import java.util.Arrays;

public class StringPermutation {

	private static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

	private static void reverse(char[] arr, int i, int j) {

		while (i < j) {
			swap(arr, i++, j--);
		}
	}

	public static void permutations(String str, int n) {

		char[] s = str.toCharArray();
		Arrays.sort(s);

		while (true) {

			System.out.print(String.valueOf(s) + " ");

			int i = n - 1;
			while (s[i - 1] >= s[i]) {

				if (--i == 0)
					return;
			}

			int j = n - 1;
			while (j > i && s[j] <= s[i - 1])
				j--;

			swap(s, i - 1, j);

			reverse(s, i, n - 1);
		}
	}

	public static void main(String[] args) {
		String s = "ABC";
		permutations(s, s.length());
	}

}
