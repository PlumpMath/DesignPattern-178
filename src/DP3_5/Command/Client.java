package DP3_5.Command;

/**
 *	客户角色 
 */
public class Client
{
	public static void main(String[] args)
	{
		//接受者
		Receiver receiver = new Receiver();
		
		//命令 确定要发送给接受者的命令
		Command command = new ConcreteCommand(receiver);
		
		//请求者 调用命令对象执行请求
		Invoker invoker = new Invoker(command);
		
		invoker.action();
	}
}
