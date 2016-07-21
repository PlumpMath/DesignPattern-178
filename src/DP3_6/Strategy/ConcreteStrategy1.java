package DP3_6.Strategy;

/**
 *	具体策略角色 
 */
public class ConcreteStrategy1 extends Strategy
{
	@Override
	public void action()//策略方法
	{
		//实现算法
		System.out.println("strategy1 operation.");
	}
}
