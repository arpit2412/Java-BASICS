import java.io.*;
class WordsCount
{
	public static void main(String args[])
	{
		Console con=System.console();
		String word;
		int count1,count=0;
		word=con.readLine();
		char ch[] = new char[word.length()]; 
		for (int i = 0; i < word.length(); i++) 
		{ 
			ch[i] = word.charAt(i);
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
			{ 
				count++; 
			}
			else
				count1++;
 		}
	System.out.println("Vowel: " +count);
	System.out.print("Consonant: " +count1);
	}
}