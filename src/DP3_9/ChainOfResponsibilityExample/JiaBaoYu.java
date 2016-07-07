package DP3_9.ChainOfResponsibilityExample;

/**
 *	具体处理者	贾宝玉
 */
public class JiaBaoYu extends Player
{
	public JiaBaoYu(Player successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void handle(int i)
	{
		if(i == 4)
		{
			System.out.println("Jia Bao Yu gotta drink!");
		}
		else
		{
			System.out.println("Jia Bao Yu passed!");
			this.next(i);
		}
	}
}
