package main.java.com.betcher.jordan.helper.library.event.examples.on;

import main.java.com.betcher.jordan.helper.library.event.onCaller.OnCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;

public class ExampleOnCaller implements ExampleThirdParty
{
	private OnCaller<Integer> buttonChanged;
	
	public ExampleOnCaller(OnCaller<Integer> onButtonCaller)
	{
		this.buttonChanged = onButtonCaller;
	}
	
	public void add(ExampleOnButtonChange onButtonChange)
	{
		buttonChanged.add(onButtonChange);
	}
	
	public void addOneCallBeforeRemoving(ExampleOnButtonChange onButtonChange)
	{
		buttonChanged.add(onButtonChange, 1);
	}
	
	public void addThreeCallsBeforeRemoving(ExampleOnButtonChange onButtonChange)
	{
		buttonChanged.add(onButtonChange, 3);
	}
	
	public void remove(ExampleOnButtonChange onButtonChange)
	{
		buttonChanged.remove(onButtonChange);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		buttonChanged.call(buttonState);
	}
}
