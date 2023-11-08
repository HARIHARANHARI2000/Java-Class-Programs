import java.util.Scanner;

public class CM1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int vowel=0,consonant=0,special=0,whitespace=0,upper=0,lower=0;
		String str1=s.nextLine();
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				if(vowel==0)
				vowel=i+1;
			}
			else if (consonant==0) {
				consonant=i+1;
			}
			if(Character.isUpperCase(ch[i])&&upper==0)
				upper=i+1;
			else if(Character.isLowerCase(ch[i])&&(lower==0))
				lower=i+1;
			}
			else if(Character.isWhitespace(ch[i])&&(whitespace==0))
				whitespace=i+1;
		
			//else if(Character.isDigit(ch[i]))
				//digit++;
			else if(special==0){
				special=i+1;

	}
			}


		//System.out.println("Alphabets:"+letter);
		//System.out.println("Digits:"+digit);
		System.out.println("Vowel:"+vowel);
		System.out.println("Consonant:"+consonant);
		//System.out.println("Special:"+special);
}
}
		


	


