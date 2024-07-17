
public class Inheritance_Employee_Salary33 extends Inheritance_Employee_Salary2
{
	 double totalsal;
	public void total()
	{
		 totalsal=bp+hra-pf-dd+bns;
		 System.out.println("Total Salary :  " +totalsal);
	}
	public static void main(String[] args) 
	{
		Inheritance_Employee_Salary33 obj=new Inheritance_Employee_Salary33();
		obj.data();
		obj.cal();
		obj.total();
		

	}

}
