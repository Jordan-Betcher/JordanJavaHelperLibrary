package main.java.com.betcher.jordan.helper.library.event;

class OnAt implements On<Void>
{
	private At at;
	
	public OnAt(At at)
	{
		this.at = at;
	}
	
	@Override
	public void call(Void unused)
	{
		at.call();
	}
}
