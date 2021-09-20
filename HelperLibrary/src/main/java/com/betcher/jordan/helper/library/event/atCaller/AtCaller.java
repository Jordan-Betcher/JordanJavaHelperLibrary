package main.java.com.betcher.jordan.helper.library.event.atCaller;

import main.java.com.betcher.jordan.helper.library.event.onCaller.OnCaller;

public class AtCaller
{
	OnCaller<Void> onCaller = new OnCaller<>();
	AtToOn atToOn = new AtToOn();
	
	public void add(At at)
	{
		if(at != null) onCaller.add(atToOn.toOn(at));
	}
	
	public void add(At at, int callsBeforeRemoving)
	{
		if(at != null) onCaller.add(atToOn.toOn(at), callsBeforeRemoving);
	}
	
	public void call()
	{
		onCaller.call(null);
	}
	
	public void remove(At at)
	{
		if(at != null) onCaller.remove(atToOn.toOn(at));
	}
}
