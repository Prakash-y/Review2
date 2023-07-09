package Review2;

public class Character {

	public static int characters(String s1)
	{
		int count = 0;
		for(int i =0; i<s1.length(); i++)
		{
			if(s1.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}
	public static int words(String s1)
	{
		int countWords = s1.split("\\s").length;
	
	return countWords;
	}
	
	public static void main(String[] args) {
		
		String s = "How are you?";
		String s1 = "welcome to bg";
		int charCount = characters(s1);
		System.out.println(charCount);
		
		int wordsCount = words(s1);
		System.out.println(wordsCount);
	}
}
