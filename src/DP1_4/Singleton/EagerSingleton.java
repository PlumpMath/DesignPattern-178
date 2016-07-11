package DP1_4.Singleton;

public class EagerSingleton
{
	private static final EagerSingleton instance = new EagerSingleton();
	
	//私有构造函数
	private EagerSingleton()
	{
	}
	
	//静态工厂方法
	public static EagerSingleton getInstance()
	{
		return instance;
	}
}
