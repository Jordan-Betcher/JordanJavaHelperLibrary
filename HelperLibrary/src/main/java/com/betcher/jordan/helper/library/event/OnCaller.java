package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;

public class OnCaller<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	ArrayList<On<T>> ons2 = new ArrayList<>();
	
	private int numberOfCalls;
	private T t;
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	public void add(On<T> on, int numberOfCalls)
	{
		ons2.add(on);
		if(this.numberOfCalls == 0) this.numberOfCalls = numberOfCalls;
	}
	
	public void remove(On<T> on)
	{
		ons.remove(on);
	}
	
	public void call(T t)
	{
		if(this.t == null) this.t = t;
		
		if(numberOfCalls != 0)
		{
			for(On<T> on : ons2)
			{
				on.call(this.t);
			}
			numberOfCalls--;
		}
		
		for(On<T> on : ons)
		{
			on.call(this.t);
		}
	}
}


