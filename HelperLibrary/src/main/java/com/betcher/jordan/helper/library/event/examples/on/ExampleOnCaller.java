package main.java.com.betcher.jordan.helper.library.event.examples.on;

import main.java.com.betcher.jordan.helper.library.event.OnCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;

public class ExampleOnCaller implements ExampleThirdParty
{
	private OnCaller<Integer> buttonChanged;
	
	public ExampleOnCaller(OnCaller<Integer> onButtonCaller)
	{
		this.buttonChanged = onButtonCaller;
	}
	
	public void add(OnButtonChange onButtonChange)
	{
		buttonChanged.add(onButtonChange);
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
		buttonChanged.call(buttonState);
	}
}
