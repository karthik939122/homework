package com.mru.homework;

public class MultiplicationOfElements {

	public static void main(String[] args) {
	
		        // Define the array
		        int[] arr = {12, 34, 56};

		        // Loop through each element of the array
		        System.out.print("Multiplication of digits: ");
		        for (int num : arr) {
		            // Print the multiplication of digits of each number
		            System.out.print(multiplyDigits(num) + " ");
		        }
		    }

		    // Method to calculate the multiplication of digits of a number
		    public static int multiplyDigits(int num) {
		        int product = 1;
		        while (num != 0) {
		            int digit = num % 10;  // Extract the last digit
		            product *= digit;  // Multiply it to the product
		            num /= 10;  // Remove the last digit
		        }
		        return product;
		    }
		
	}