package DP1_2.Factory_Method;

public class Grape implements Fruit
{
	private boolean seedless;
	@Override
	public void grow()
	{
		log("grape is growing...");
	}
	
	@Override
	public void harvest()
	{
		log("grape has harvested!!!");
	}
	
	@Override
	public void plant()
	{
		log("grape has planted!!!");
	}
	
//	辅助方法
	public static void log(String msg)
	{
		System.out.println(msg);
	}
	
//	有无仔的取值方法	
	private boolean getSeedless()
	{
		return seedless;
	}
	
//	有无仔的赋值方法
	public void setSeedless(boolean seedless)
	{
		this.seedless = seedless;
	}
}
