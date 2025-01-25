package com.mru.homework;

public class ArraySumOfElements {

	public static void main(String[] args) {
		
		        // Define the array
		        int[] arr = {123, 456, 789};

		        // Loop through each element of the array
		        System.out.print("Sum of digits: ");
		        for (int num : arr) {
		            // Print the sum of digits of each number
		            System.out.print(sumOfDigits(num) + " ");
		        }
		    }

		    // Method to calculate the sum of digits of a number
		    public static int sumOfDigits(int num) {
		        int sum = 0;
		        while (num != 0) {
		            sum += num % 10;  // Add the last digit to the sum
		            num /= 10;  // Remove the last digit
		        }
		        return sum;
		    }
		

	}