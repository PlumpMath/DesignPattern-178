package DP2_3.Proxy;

public class test
{
	public static void main(String[] args)
	{
		Subject subject = new ProxySubject();
		
		subject.request();
	}
}
