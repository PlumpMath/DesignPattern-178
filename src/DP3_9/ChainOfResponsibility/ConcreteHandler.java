package DP3_9.ChainOfResponsibility;

/**
 *	具体处理者
 */
public class ConcreteHandler extends Handler
{
	//处理方法,调用此方法处理请求
	@Override
	public void handleRequest()
	{
		if(this.getSuccessor() != null)
		{
			System.out.println("请求传给下一家 :" + this.getSuccessor());
			
			this.getSuccessor().handleRequest();
		}
		else
		{
			System.out.println("这里处理请求");
		}
	}
}
