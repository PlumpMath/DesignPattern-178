package DP3_11.TemplateMethod;

/**
 *  具体模板
 *	定期存款账号 
 */
public class CDAccount extends Account
{
	@Override
	protected double doCalculateInterestType()
	{
		return 0.065D;
	}
	
	@Override
	protected String doCalculateAccountType()
	{
		return "Certificate of Deposite";
	}
}
