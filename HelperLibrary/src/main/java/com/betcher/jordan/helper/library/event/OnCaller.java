package main.java.com.betcher.jordan.helper.library.event;

import java.util.ArrayList;
import java.util.HashMap;

public class OnCaller<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	HashMap<On<T>, Integer> onNumberOfCalls = new HashMap<>();
	
	private int numberOfCalls;
	private T t;
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	public void add(On<T> on, int numberOfCalls)
	{
		onNumberOfCalls.put(on, numberOfCalls);
	}
	
	public void remove(On<T> on)
	{
		ons.remove(on);
	}
	
	public void call(T t)
	{
		if(this.t == null) this.t = t;
		
		for(On<T> on : onNumberOfCalls.keySet())
		{
			int numberOfCalls = onNumberOfCalls.get(on);
			if(numberOfCalls > 0)
			{
				on.call(this.t);
			}
			numberOfCalls--;
			onNumberOfCalls.replace(on, numberOfCalls);
		}
		
		for(On<T> on : ons)
		{
			on.call(this.t);
		}
	}
}


