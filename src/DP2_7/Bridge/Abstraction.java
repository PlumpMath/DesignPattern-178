package DP2_7.Bridge;

/**
 *	抽象化角色 
 */
public abstract class Abstraction
{
	//聚合(含有Implementor的引用)
	public void operation(Implementor imp)
	{
		imp.operationImp();
	}
}
