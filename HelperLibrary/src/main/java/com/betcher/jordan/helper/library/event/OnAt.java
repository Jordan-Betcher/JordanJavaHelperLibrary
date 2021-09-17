package main.java.com.betcher.jordan.helper.library.event;

class OnAt implements On<Void>
{
	public OnAt(At at)
	{
		at.call();
	}
	
	@Override
	public void call(Void unused)
	{
	
	}
}
