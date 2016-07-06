package DP3_8.Visitor;

/**
 *	抽象结点角色 
 */
public abstract class Node
{
	//接受操作
	public abstract void accept(Visitor visitor);
}
