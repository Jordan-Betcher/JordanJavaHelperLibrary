package main.java.com.betcher.jordan.helper.library.event;

public class Event<T> implements On<T>
{
	public void add(On<T> on)
	{
		try
		{
			((On<Integer>) on).call(0);
		}finally
		{
		
		}
		
		try
		{
			((On<String>) on).call("A");
		}finally
		{
		
		}
	}
	
	@Override
	public void call(T t)
	{
	
	}
}
