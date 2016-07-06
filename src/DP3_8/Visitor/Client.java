package DP3_8.Visitor;

public class Client
{
	private static ObjectStructure objectstru;
	private static Visitor visitor;
	
	public static void main(String[] args)
	{
		//创建一个结构对象
		objectstru = new ObjectStructure();
		
		//给结构增加一个节点
		objectstru.add(new NodeA());
		//给结构增加一个节点
		objectstru.add(new NodeB());
		
		//创建一个新的访问者
		visitor = new VisitorA();
		//让访问者访问结构
		objectstru.action(visitor);
	}
}
