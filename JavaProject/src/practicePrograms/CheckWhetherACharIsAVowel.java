package practicePrograms;

public class CheckWhetherACharIsAVowel {
	public static void main(String args[]) {
		
	 char vowel [] = {'a','e','i','o','u','A','E','I','O','U'};	
	 char ch = 'Z';
	 boolean isVowel  = false;
	 for (int  i=0;i<vowel.length;i++) {
		 if(vowel[i]==ch) {
			 isVowel = true;
		 }
	 }
		 if(isVowel == true) {
			 System.out.println(ch +" --> is a vowel");
		 } else {
			 System.out.println(ch+ " --> is not a vowel");
		 }
			
			
	 }
	

	}


