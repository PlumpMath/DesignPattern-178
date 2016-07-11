package DP1_4.Singleton;

public class LazySingleton
{
	private static LazySingleton instance= null;
	
	//私有构造方法
	private LazySingleton()
	{
	}
	
	//静态工厂方法
	public static LazySingleton getInstance()
	{
		if(instance == null)
		{
			instance = new LazySingleton();
		}
		return instance;
	}
}
