package main.java.com.betcher.jordan.helper.library.event;

public class AtCaller
{
	OnCaller<Void> onCaller;
	AtToOn atToOn;
	
	public void add(At at)
	{
		onCaller.add(atToOn.toOn(at));
	}
	
	public void add(At at, int numberOfCalls)
	{
		if(at != null) onCaller.add(atToOn.toOn(at), numberOfCalls);
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
