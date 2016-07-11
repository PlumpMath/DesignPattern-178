package DP1_4.Singleton;

public class SynchronizedSingleton
{
	private static SynchronizedSingleton instance= null;
	
	//私有构造方法
	private SynchronizedSingleton()
	{
	}
	
	//加synchronized关键字的静态工厂方法
	public synchronized static SynchronizedSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new SynchronizedSingleton();
		}
		return instance;
	}
}
