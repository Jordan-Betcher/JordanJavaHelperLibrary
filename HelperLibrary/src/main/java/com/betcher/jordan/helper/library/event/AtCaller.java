package main.java.com.betcher.jordan.helper.library.event;

public class AtCaller
{
	private OnCaller<Void> onCaller;
	private AtToOn atToOn;
	
	public AtCaller(OnCaller<Void> onCaller, AtToOn atToOn)
	{
		
		this.onCaller = onCaller;
		this.atToOn = atToOn;
	}
	
	public void add(At at)
	{
		onCaller.add(atToOn.toOn(at));
	}
	
	public void add(At at, int numberOfCalls)
	{
		if(at != null) onCaller.add(atToOn.toOn(at), 1);
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
