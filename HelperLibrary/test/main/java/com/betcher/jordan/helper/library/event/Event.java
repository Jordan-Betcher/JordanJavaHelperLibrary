package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;

public class Event<T> implements On<T>
{
	private ArrayList<On<T>> ons = new ArrayList<>();
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	@Override
	public void call(T t)
	{
		for(On<T> on : ons)
		{
			on.call(t);
		}
	}
}
