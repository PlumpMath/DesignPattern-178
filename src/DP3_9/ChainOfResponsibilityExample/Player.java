package DP3_9.ChainOfResponsibilityExample;

/**
 *	抽象处理者
 */
public abstract class Player
{
	//请求处理方法,调用此方法处理请求
	public abstract void handle(int i);
	
	//下一个处理者
	private Player successor;
	
	//调用此方法设定下家
	public void setSuccessor(Player successor)
	{
		this.successor = successor;
	}
	
	/**
	 *	将"花"传给下家;如果没有下家系统停止运行
	 */
	public void next(int index)
	{
		//判断下家对象是否有效
		if(successor != null)
		{
			//将请求传给下家
			successor.handle(index);
		}
		else
		{
			//系统停止运行
			System.out.println("Program terminated");
			
			System.exit(0);
		}
	}
	
}
