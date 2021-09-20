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
		buttonChanged.add(onButtonChange, 1);
	}
	
	public void addThreeCallsBeforeRemoving(OnButtonChange onButtonChange)
	{
	
	}
	
	public void remove(OnButtonChange onButtonChange)
	{
		buttonChanged.remove(onButtonChange);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		buttonChanged.call(buttonState);
	}
}
