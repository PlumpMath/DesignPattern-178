单例模式	[对象创建型模式]

单例模式例外情况:

1.通过反射机制,强行调用单例类的私有构造函数,生成多个单例;
  解决:可在单例类的私有构造函数中添加        
  
  		// 防止反射获取多个对象的漏洞  
        if (null != instance) 
        {  
            throw new RuntimeException();  
        }  
因为反射的方式新建单例对象,还是要调用单例类的构造函数;
	


2.序列化和反序列化可能破坏单例.

解决:为了能在序列化过程仍能保持单例的特性，可以在单例类中添加一个readResolve()方法，在该方法中直接返回单例类的单例对象;

无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到,
实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象.

	//防止反序列化获取多个对象的漏洞
	private Object readResolve() throws ObjectStreamException
	{
		return instance;
	}