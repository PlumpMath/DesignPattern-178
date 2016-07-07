package DP3_9.ChainOfResponsibilityExample;

/**
 *	具体处理者	贾赦
 */
public class JiaShe extends Player
{
	public JiaShe(Player successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void handle(int i)
	{
		if(i == 2)
		{
			System.out.println("Jia She gotta drink!");
		}
		else
		{
			System.out.println("Jia She passed!");
			this.next(i);
		}
	}
}
