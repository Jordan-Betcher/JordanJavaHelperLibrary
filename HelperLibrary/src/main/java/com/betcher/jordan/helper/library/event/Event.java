package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;
import java.util.List;

public class Event
{
	private ArrayList<Listener> listeners = new ArrayList<>();
	
	public void add(Listener listener)
	{
		listeners.add(listener);
	}
	
	public void remove(Listener listener)
	{
		listeners.remove(listener);
	}
	
	public void call()
	{
		for(Listener listener : listeners)
		{
			listener.call();
		}
	}
}
