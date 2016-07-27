package DP3_11.TemplateMethod;

/**
 *  具体模板
 *	货币市场账号 
 */
public class MoneyMakerAccount extends Account
{
	@Override
	protected double doCalculateInterestType()
	{
		return 0.045D;
	}
	
	@Override
	protected String doCalculateAccountType()
	{
		return "Money Market";
	}
}
