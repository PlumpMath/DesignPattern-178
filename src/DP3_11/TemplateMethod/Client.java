package DP3_11.TemplateMethod;

public class Client
{
	private static Account acct = null;

	public static void main(String[] args)
	{
		acct = new MoneyMakerAccount();
		
		System.out.println("货币市场利息 " + acct.calculateInterest());
		
		acct = new CDAccount();
		
		System.out.println("定期存款利息 " + acct.calculateInterest());
	}
}
