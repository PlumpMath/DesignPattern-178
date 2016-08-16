package DP1_4.Singleton;

/**
 * 最简单的单例模式
 */
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
