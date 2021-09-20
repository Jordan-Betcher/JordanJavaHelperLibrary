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
		onButtonCaller.add(onButtonChange);
	}
	
	public void addOneCallBeforeRemoving(OnButtonChange onButtonChange)
	{
		onButtonCaller.add(onButtonChange, 1);
	}
	
	public void addThreeCallsBeforeRemoving(OnButtonChange onButtonChange)
	{
		onButtonCaller.add(onButtonChange, 3);
	}
	
	public void remove(OnButtonChange onButtonChange)
	{
		onButtonCaller.remove(onButtonChange);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		onButtonCaller.call(buttonState);
	}
}
