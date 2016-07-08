package DP2_8.Facade;

/**
 *	子系统角色 
 */
public class Camera
{
	public void turnOn()
	{
		System.out.println("Turning on the camera.");
	}

	public void turnOff()
	{
		System.out.println("Turning off the camera.");
	}
	
	public void rotate(int degrees)
	{
		System.out.println("rotate the camera by" + degrees + "degrees.");
	}
	
}
