public class StringContains
{
  
	public static boolean contains(String phrase, String word)
	{

		if(phrase.length() < word.length())//check word is greter then phrase length
		{
			return false;//if true then return false
		}
		
		else
		{
			boolean containsCh=false;

			for(int x = 0; x < word.length(); x++)
			{
				if(phrase.charAt(x) != word.charAt(x))//if two character in two strings are not match
					if((x + 1) == word.length())//then check x is reached word length
					{
						containsCh = false;//then set cintains flag to false
						break;//and break from FOR loop
					}
					else
						break;//otherwise directly come out from FOR loop
				else {//other wise 
					if((x + 1) == word.length())// check x is reached word length
					{
						containsCh = true;//then set cintains flag to true
						break;//and break from FOR loop
					}
					else
						continue;//then continue for check next character
				}
		}
		
		char[] charArray = new char[(phrase.length()-1)];
		//convert stack to char array

		for(int y = 1; y < charArray .length; y++)
		{
			charArray[y - 1] = phrase.charAt(y);
		}

		String newHaystack = new String(charArray);//convert char array to string

		if(containsCh == false)
			return contains(newHaystack, word);//call recursivly
		else
			return true;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Java Programming contains ogr is "+contains("Java programming", "ogr"));
		System.out.println("Java Programming contains grammy is "+contains("Java programming", "grammy"));
		System.out.println("Java Programming contains mmin is "+contains("Java programming", "mmin"));
	}
  
}