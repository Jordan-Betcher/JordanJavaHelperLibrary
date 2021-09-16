package main.java.com.betcher.jordan.helper.library.event;

public interface On<T>
{
	void call(Event<T> event);
}
