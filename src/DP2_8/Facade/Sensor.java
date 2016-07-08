package DP2_8.Facade;

/**
 *	子系统角色 
 */
public class Sensor
{
	public void activate()
	{
		System.out.println("Activating the sensor.");
	}

	public void deactivate()
	{
		System.out.println("Deactivating the sensor.");
	}
	
	public void trigger()
	{
		System.out.println("The sensor has been triggered.");
	}
}
