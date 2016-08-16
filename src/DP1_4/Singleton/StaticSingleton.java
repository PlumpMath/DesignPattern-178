package DP1_4.Singleton;

/**
 *	单例模式使用内部类来维护单例的实例 
 *
 *	当StaticSingleton被加载时,其内部类并不会被初始化,故可以确保党StaticSingleton类被加载人JVM时,
 *	不会初始化单例类,而当getInstance()方法被调用时,才会加载SingletonHolder,从而初始化instance.
 *	同时,由于实例的建立是在类加载时完成,故天生对多线程友好,getInstance()方法也不需要同步关键字.
 *
 *
 *	适用内部列的方式实现单例,既可以做到延迟加载,也不必适用同步关键字,是一种比较完善的实现.
 */
public class StaticSingleton
{
	//私有构造函数
	private StaticSingleton()
	{
	}
	
	//内部类
	private static class SingletonHolder
	{
		static
		{
			System.out.println("SingletonHolder被加载.");
		}
		private static StaticSingleton instance = new StaticSingleton();
	}
	
	//工厂方法
	public static StaticSingleton getInstance()
	{
		return SingletonHolder.instance;
	}
}
