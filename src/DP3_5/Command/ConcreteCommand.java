package DP3_5.Command;

/**
 *	具体命令角色 
 */
public class ConcreteCommand implements Command
{
	private Receiver receiver;
	
	//具体命令类和接受者类之间是组合关系
	public ConcreteCommand(Receiver receiver)
	{
		this.receiver = receiver;
	}

	@Override
	public void execute()//执行方法
	{
		receiver.action();
	}
}
