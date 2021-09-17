package main.java.com.betcher.jordan.helper.library.event;

import java.util.*;

public class OnCaller<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	HashMap<On<T>, Integer> onNumberOfCalls = new HashMap<>();
	
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
		onNumberOfCalls.remove(on);
	}
	
	public void call(T t)
	{
		Iterator<Map.Entry<On<T>, Integer>> iterator = onNumberOfCalls.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<On<T>, Integer> entry = iterator.next();
			if(entry.getValue() > 0)
			{
				entry.getKey().call(t);
				entry.setValue(entry.getValue() - 1);
			}
			
			if(entry.getValue() <= 0)
			{
				iterator.remove();
			}
		}
		
		for(On<T> on : ons)
		{
			on.call(t);
		}
	}
}


