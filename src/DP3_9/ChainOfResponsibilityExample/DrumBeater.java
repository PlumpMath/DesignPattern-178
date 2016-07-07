package DP3_9.ChainOfResponsibilityExample;

/**
 *	客户端 
 */
public class DrumBeater
{
	private static Player player;
	
	public static void main(String[] args)
	{
		//创建责任链
//		player = new JiaMu(new JiaZheng(new JiaBaoYu(new JiaHuan(null))));
		player = new JiaMu(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(null)))));
		
		//规定由第4个处理者处理请求
		player.handle(4);
	}
	
}
