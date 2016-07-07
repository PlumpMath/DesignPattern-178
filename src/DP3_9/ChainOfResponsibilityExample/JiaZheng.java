package DP3_9.ChainOfResponsibilityExample;

/**
 *	具体处理者	贾政
 */
public class JiaZheng extends Player
{
	public JiaZheng(Player successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void handle(int i)
	{
		if(i == 3)
		{
			System.out.println("Jia Zheng gotta drink!");
		}
		else
		{
			System.out.println("Jia Zheng passed!");
			this.next(i);
		}
	}
}
