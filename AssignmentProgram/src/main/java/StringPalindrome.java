
public class StringPalindrome {

	
		public static void main(String[] args) 
		{
			String str="mom";
			String rev="";
			char ch;
			
			
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i); 
				rev=ch+rev;
				
				
			}
			if(str.equals(rev))
			{
				System.out.println("String is palindrome");
			}
			else
			{
			System.out.println("String is not palindrome");
			}
			

	}

}
