package main.java.com.betcher.jordan.helper.library.event;

import java.util.List;

public class Event
{
	
	
	private Listener listener;
	
	public void add(Listener listener)
	{
		this.listener = listener;
	}
	
	public void remove(Listener listener)
	{
	
	}
	
	public void call()
	{
		listener.call();
	}
}
