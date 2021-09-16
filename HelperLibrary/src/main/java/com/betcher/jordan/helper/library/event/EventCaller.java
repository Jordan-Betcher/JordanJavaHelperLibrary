package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;

public class EventCaller<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	private EventFactory<T> eventFactory;
	
	public EventCaller(EventFactory<T> eventFactory)
	{
		this.eventFactory = eventFactory;
	}
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	public void remove(On<T> on)
	{
		ons.remove(on);
	}
	
	public void call(T t)
	{
		for(On<T> on : ons)
		{
			on.call(eventFactory.createEvent(this, t));
		}
	}
}


