package main.java.com.betcher.jordan.helper.library.event;

public class EventFactory<T>
{
	public Event<T> createEvent(EventCaller<T> eventCaller, T object)
	{
		return new Event<>(eventCaller, object);
	}
}
