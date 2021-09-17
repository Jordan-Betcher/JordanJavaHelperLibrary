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
		onCaller.add(atToOn.toOn(at), numberOfCalls);
	}
	
	public void call()
	{
		onCaller.call(null);
	}
	
	public void remove(At at)
	{
		onCaller.remove(atToOn.toOn(at));
	}
}
