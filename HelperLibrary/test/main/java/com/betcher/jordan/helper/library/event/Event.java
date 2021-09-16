package main.java.com.betcher.jordan.helper.library.event;

public class Event<T> implements On<T>
{
	private On<T> on;
	
	public void add(On<T> on)
	{
		this.on = on;
	}
	
	@Override
	public void call(T t)
	{
		on.call(t);
	}
}
