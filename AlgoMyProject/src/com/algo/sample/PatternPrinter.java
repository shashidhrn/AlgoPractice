package com.algo.sample;

import java.util.Scanner;

/**
 * Sample Program to print the right angled triangle with continuous numbers and
 * creating a mirror
 * 
 * @author shash
 *
 */
public class PatternPrinter {

	public static void main(String[] args) {
		//scanner to read the input of n
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for the triangle : ");
		
		int n = s.nextInt();
		s.close();
		int a[][] = new int[n][n];
		int counter = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(counter + " ");
				a[i][j] = counter;
				counter++;
			}
			System.out.println();
		}

		//mirroring the created array
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				int val = a[i][j];
				if (val != 0) {
					System.out.print(val + " ");
				}
			}
			System.out.println();
		}
	}

}
