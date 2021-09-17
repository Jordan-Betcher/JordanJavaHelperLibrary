package main.java.com.betcher.jordan.helper.library.event;

class AtToOn
{
	public On<Void> toOn(At at)
	{
		return new OnAt(at);
	}
}
