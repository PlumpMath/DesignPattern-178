package DP2_8.Facade;

/**
 *	客户端 
 */
public class Client
{
	private static SecurityFacade facade;
	private static SecurityFacade facade2;
	
	public static void main(String[] args)
	{
		facade = new SecurityFacade();
		
		facade.activate();
	}
}
