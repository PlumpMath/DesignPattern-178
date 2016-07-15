package DP3_11.TemplateMethod;

public abstract class Account
{
	protected String accountNumber;
	
	public Account()
	{
			accountNumber = null;
	}

	public Account(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	/**
	 *	模板方法:计算利息数额 
	 */
	public final double calculateInterest()
	{
		
		double interestRate = doCalculateInterestType();
		
		String accountType = doCalculateAccountType();
		
		double amount = calculateAmount(accountType , accountNumber);
		
		return amount * interestRate;
	}
	
	protected abstract String doCalculateAccountType();
	protected abstract double doCalculateInterestType();
		
	public final double calculateAmount(String accountType , String accountNumber)
	{
		return 7000.00D;                          
	}
}
