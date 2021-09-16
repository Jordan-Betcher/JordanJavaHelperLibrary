package main.java.com.betcher.jordan.helper.library.event;

public class Event<T> implements On<T>
{
	public void add(On<T> on)
	{
		On<Integer> on2 = (On<Integer>) on;
		on2.call(0);
	}
	
	@Override
	public void call(T t)
	{
	
	}
}
