package main.java.com.betcher.jordan.helper.library.event.atCaller;

import main.java.com.betcher.jordan.helper.library.event.onCaller.On;

class AtToOn
{
	public On<Void> toOn(At at)
	{
		return new OnAt(at);
	}
}
