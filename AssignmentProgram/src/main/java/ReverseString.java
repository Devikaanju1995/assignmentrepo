import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String str="Devika";
		String rev="";
		char ch;
		
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i); // returns the character at the specified index in a string. 
			                  //The index of the first character is 0, the second character is 1, and so on.
			rev=ch+rev;
		}
		System.out.println("String is :"+str);
      System.out.println("Reverse is :" +rev);
	}

}
