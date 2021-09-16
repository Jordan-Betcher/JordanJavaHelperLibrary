package main.java.com.betcher.jordan.helper.library.event;

public class Event<T>
{
	private final EventCaller<T> eventCaller;
	private final T object;
	
	public Event(EventCaller<T> eventCaller, T object)
	{
		this.eventCaller = eventCaller;
		this.object = object;
	}
	
	public void remove(On<T> on)
	{
		//TODO
	}
	
	public T object()
	{
		return null; //TODO
	}
}
