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
	
	}
	
	public void call()
	{
	
	}
	
	public void remove(At at)
	{
	
	}
}
