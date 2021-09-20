package main.java.com.betcher.jordan.helper.library.event.examples.on;

import main.java.com.betcher.jordan.helper.library.event.Event;
import main.java.com.betcher.jordan.helper.library.event.OnCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;
import main.java.com.betcher.jordan.helper.library.event.examples.event.ExampleButtonPressedListener;
import main.java.com.betcher.jordan.helper.library.event.examples.event.ExampleButtonReleasedListener;

public class ExampleOnCaller implements ExampleThirdParty
{
	private OnCaller<Integer> onButtonCaller;
	
	public ExampleOnCaller(OnCaller<Integer> onButtonCaller)
	{
		this.onButtonCaller = onButtonCaller;
	}
	
	public void add(OnButtonChange onButtonChange)
	{
	
	}
	
	public void addOneCallBeforeRemoving(OnButtonChange onButtonChange)
	{
	
	}
	
	public void addThreeCallsBeforeRemoving(OnButtonChange onButtonChange)
	{
	
	}
	
	public void remove(OnButtonChange onButtonChange)
	{
	
	}
	
	@Override
	public void onClick(int buttonState)
	{
		onButtonCaller.call(buttonState);
	}
}
