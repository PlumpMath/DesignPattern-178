package DP3_4.State;

/**
 *	环境角色
 */
public class Context
{
	//环境类持有一个具体状态类的实例
	private State state;
	
	//环境类与状态类之间是聚合关系
	public void setState(State state)
	{
		this.state = state;
	}
	
	public void operation()
	{
		//当持有的具体状态类不同时,该操作产生不同的行为
		state.operation();
	}
}
