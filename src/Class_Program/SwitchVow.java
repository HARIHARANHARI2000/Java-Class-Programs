package Class_Program;

import java.util.Scanner;

public class SwitchVow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().chartAt(0);
		switch(ch) {
		case'a':
		case'A':
		case'e':
		case'E':
		case'i':
		case'I':
		case'o':
		case'O':
		case'u':
		case'U':
			System.out.println("Vowel");
			break;
			default:
				System.out.println("Not a Vowel");
		}
	}

}
