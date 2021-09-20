package main.java.com.betcher.jordan.helper.library.event;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;

public class Event
{
	private AtCaller atCaller = new AtCaller();
	
	public void add(Listener listener)
	{
		atCaller.add(listener);
	}
	
	public void remove(Listener listener)
	{
		atCaller.remove(listener);
	}
	
	public void call()
	{
		atCaller.call();
	}
}
