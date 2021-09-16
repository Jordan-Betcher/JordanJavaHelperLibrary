package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;
import java.util.List;

public class EventCaller<T> implements Event<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	boolean go = true;
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	@Override
	public void remove(On<T> on)
	{
		ons.remove(on);
	}
	
	@Override
	public T object()
	{
		return null;
	}
	
	public void call(T t)
	{
		if(go)
		{
			for(On<T> on : ons)
			{
				on.call(this);
			}
		}
	}
}
