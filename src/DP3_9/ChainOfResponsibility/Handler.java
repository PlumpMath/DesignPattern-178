package DP3_9.ChainOfResponsibility;

/**
 *	 抽象处理者 
 */
public abstract class Handler
{
	protected Handler successor;
	
	//处理方法,调用此方法处理请求
	public abstract void handleRequest();
	
	//设定下家
	public void setSuccessor(Handler successor)
	{
		this.successor = successor;
	}
	
	public Handler getSuccessor()
	{
		return successor;
	}
	
}
