package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;
import java.util.List;

public class EventCaller<T> implements Event<T>
{
	public void add(On<T> on)
	{
		on.call(this);
	}
	
	@Override
	public void remove(On<T> on)
	{
	
	}
	
	@Override
	public T object()
	{
		return null;
	}
	
	public void call(T t)
	{
	
	}
}