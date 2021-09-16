package main.java.com.betcher.jordan.helper.library.event;

public interface Event<T>
{
	void add(On<T> on);
	void remove(On<T> on);
	T object();
}
