package com.mru.homework;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		        int[] arr = {101, 102, 301, 401, 501};

		        // Loop through each element of the array
		        for (int i = 0; i < arr.length; i++) {
		            // Reverse the digits of each number
		            arr[i] = reverseNumber(arr[i]);
		        }

		        // Print the reversed array
		        System.out.print("Reversed array: ");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }

		    // Method to reverse the digits of a number
		    public static int reverseNumber(int num) {
		        int reversed = 0;
		        while (num != 0) {
		            int digit = num % 10;  // Get the last digit
		            reversed = reversed * 10 + digit;  // Add it to the reversed number
		            num /= 10;  // Remove the last digit
		        }
		        return reversed;
		    }
		}