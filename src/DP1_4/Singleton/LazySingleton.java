package DP1_4.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 	延迟加载单例模式
 * 	缺陷:多线程调用时可能不能保证单例性.
 * 		如:在多线程环境下,当线程1正新建单例时,完成赋值操作前,线程2可能判断instance为null,故线程2
 * 		也将启动新建单例的程序,而导致多个实例被创建.
 */
public class LazySingleton implements Serializable
{
	private static LazySingleton instance= null;
	
	//私有构造方法
	private LazySingleton()
	{
  		// 防止反射获取多个对象的漏洞  
        if (null != instance) 
        {  
            throw new RuntimeException();  
        } 
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
	
	//防止反序列化获取多个对象的漏洞
	private Object readResolve() throws ObjectStreamException
	{
		return instance;
	}
}
