package Class_Program;

import java.util.Scanner;

public class LogicExample {
		private static Scanner scanner;

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter an input number: ");
	        scanner = null;
			int input = s.nextInt();

	        int output = calculateOutput(input);

	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
			

		}

		private static int calculateOutput(int input) {
			// TODO Auto-generated method stub
			return input *3;
		}

	}


