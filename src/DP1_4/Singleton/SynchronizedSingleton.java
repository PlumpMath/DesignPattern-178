package DP1_4.Singleton;

/**
 *	同步了工厂方法的单例模式
 *	延迟加载,同步
 *	缺点: 因为涉及到同步锁,性能下降.
 */
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
