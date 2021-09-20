package main.java.com.betcher.jordan.helper.library.event.examples.at;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;

public class ExampleAtCaller implements ExampleThirdParty
{
	private AtCaller buttonPressed;
	private AtCaller buttonReleased;
	
	public ExampleAtCaller(AtCaller buttonPressed, AtCaller buttonReleased)
	{
		this.buttonPressed = buttonPressed;
		this.buttonReleased = buttonReleased;
	}
	
	public void add(ExampleAtButtonPressed atButtonPressed)
	{
		buttonPressed.add(atButtonPressed);
	}
	
	public void addOneCall(ExampleAtButtonPressed atButtonPressed)
	{
		buttonPressed.add(atButtonPressed, 1);
	}
	
	public void add(ExampleAtButtonReleased atButtonReleased)
	{
		buttonReleased.add(atButtonReleased);
	}
	
	public void remove(ExampleAtButtonPressed atButtonPressed)
	{
		buttonPressed.remove(atButtonPressed);
	}
	
	public void remove(ExampleAtButtonReleased atButtonReleased)
	{
		buttonReleased.remove(atButtonReleased);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		if(buttonState == BUTTON_PRESSED) buttonPressed.call();
		if(buttonState == BUTTON_RELEASED) buttonReleased.call();
	}
}
