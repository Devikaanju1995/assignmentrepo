
public class Overiding_Super_return_Addition2 extends Overiding_Super_return_Addition
{


	public int sum() 
	{
		super.sum();
		if(num%10==0)
		{
			System.out.println("Addition Number is divisible by 10");
		}
		else
		{
			System.out.println("Addition Number is not divisible by 10");
		}
		return num;
		
		}
	public static void main(String[] args) 
	{
		Overiding_Super_return_Addition2 obj=new Overiding_Super_return_Addition2();
		System.out.println("sum is :" +obj.sum());

	}

}
