package DP3_6.Strategy;

/**
 *	环境角色 
 */
public class Context
{
	private Strategy strategy;
	
	public Strategy getStrategy()
	{
		return strategy;
	}
	
	public void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	//策略方法
	public void operation()
	{
		strategy.action();
	}
}
