package DP3_5.Command;

/**
 *	请求者角色 
 */
public class Invoker
{
	private Command command;
	
	//请求者类和命令类之间是聚合关系
	public Invoker(Command command)
	{
		this.command = command;
	}
	
	//行动方法
	public void action()
	{
		command.execute();
	}
}
