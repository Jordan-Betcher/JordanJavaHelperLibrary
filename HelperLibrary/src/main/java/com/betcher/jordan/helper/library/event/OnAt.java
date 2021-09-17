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
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof OnAt)
		{
			OnAt onAt = (OnAt) obj;
			return this.at.equals(onAt.at);
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return this.at.hashCode();
	}
}
