package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;

public class OnCaller<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	private On<T> on;
	private T t;
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	public void add(On<T> on, int numberOfCalls) {this.on = on;}
	
	public void remove(On<T> on)
	{
		ons.remove(on);
	}
	
	public void call(T t)
	{
		if(this.t == null) this.t = t;
		if(on != null)
		{
			on.call(t);
			on = null;
		}
		for(On<T> on : ons)
		{
			on.call(this.t);
		}
	}
}


