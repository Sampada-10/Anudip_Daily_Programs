/*Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"*/
package practicecode;

import java.util.Scanner;

public class LongestWord {
	public String longestWord(String sen)
	{
		String[] words = sen.split(" ");
        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        return longestWord;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LongestWord c=new LongestWord();
		System.out.println("Enter the String : ");
		String sen=sc.nextLine();
		String str=c.longestWord(sen);
		System.out.println("Longest word : "+str);
	}

}
