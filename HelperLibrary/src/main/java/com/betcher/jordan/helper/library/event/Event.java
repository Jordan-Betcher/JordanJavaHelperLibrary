package main.java.com.betcher.jordan.helper.library.event;

import java.util.List;

public class Event
{
	private Listener listener;
	
	public void add(Listener listener)
	{
		if(this.listener ==null) this.listener = listener;
	}
	
	public void remove(Listener listener)
	{
		this.listener = null;
	}
	
	public void call()
	{
		if(listener != null) listener.call();
	}
}
