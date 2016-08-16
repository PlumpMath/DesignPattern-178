package DP1_4.Singleton;

/**
 *	加同步代码块的单例模式 
 *
 */
public class SingletonClass
{
	private static SingletonClass instance = null;

	public static SingletonClass getInstance()
	{
		synchronized (SingletonClass.class)
		{
			if (instance == null)
			{
				instance = new SingletonClass();
			}
		}
		return instance;
	}

	private SingletonClass()
	{

	}

}