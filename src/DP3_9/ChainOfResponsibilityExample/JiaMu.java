package DP3_9.ChainOfResponsibilityExample;

/**
 *	具体处理者	贾母 
 */
public class JiaMu extends Player
{
	public JiaMu(Player successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void handle(int i)
	{
		if(i == 1)
		{
			System.out.println("Jia Mu gotta drink!");
		}
		else
		{
			System.out.println("Jia Mu passed!");
			this.next(i);
		}
	}
}
