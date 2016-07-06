package DP3_8.Visitor;

/**
 *	具体访问者 
 */
public class VisitorB implements Visitor
{
	//对应于NodeA的访问操作
	@Override
	public void visit(NodeA node)
	{
		System.out.println(node.operationA());
	}
	
	//对应于NodeB的访问操作
	@Override
	public void visit(NodeB node)
	{
		System.out.println(node.operationB());
	}
}
