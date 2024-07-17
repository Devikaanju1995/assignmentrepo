
public class NumberPalindrome {

	public static void main(String[] args) 
	{
		int num=1012;
		int rev=0;
		int num1=num ;
		System.out.println("Orginal number is : "+num);
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		
		if(num1==rev)
		{
			System.out.println("Number is palindrome: "+num1);
		}
		else
		{
		System.out.println("Number is not palindrome: "+rev );
		}

	}

}
