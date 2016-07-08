package DP2_8.Facade;

/**
 *	子系统角色 
 */
public class Light
{
	public void turnOn()
	{
		System.out.println("Turning on the light.");
	}

	public void turnOff()
	{
		System.out.println("Turning off the light.");
	}
	
	public void changeBulb()
	{
		System.out.println("changing the light-bulb.");
	}
}
