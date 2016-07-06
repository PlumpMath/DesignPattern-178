package DP1_1.SimpleFactory;

public class StrawBerry implements Fruit
{
	@Override
	public void grow()
	{
		log("strawberry is growing...");
	}
	
	@Override
	public void harvest()
	{
		log("strawberry has harvested!!!");
	}
	
	@Override
	public void plant()
	{
		log("strawberry has planted!!!");
	}
	
//	辅助方法
	public static void log(String msg)
	{
		System.out.println(msg);
	}
}
