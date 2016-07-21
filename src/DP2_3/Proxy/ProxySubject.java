package DP2_3.Proxy;

/**
 *	代理主题角色 
 */
public class ProxySubject extends Subject
{
	//代理对象含有RealSubject对象的引用
	private RealSubject realsubject;
	
	/**
	 *	请求前操作 
	 */
	private void preRequest()
	{
		System.out.println("prerequest!");
	}
	
	/**
	 *	请求后操作 
	 */
	private void postRequest()
	{
		System.out.println("postrequest");
	}
	
	/**
	 * 实现请求方法
	 */
	@Override
	public void request()
	{
		preRequest();//可插入业务代码
		
		if(realsubject == null)
		{
			realsubject = new RealSubject();
		}
		
		realsubject.request();
		
		postRequest();//可插入业务代码
	}
}
