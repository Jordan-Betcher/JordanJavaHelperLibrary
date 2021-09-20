package main.java.com.betcher.jordan.helper.library.event.examples.at;

import main.java.com.betcher.jordan.helper.library.event.AtCaller;
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
	
	public void add(AtButtonPressed atButtonPressed)
	{
		buttonPressed.add(atButtonPressed);
	}
	
	public void addOneCall(AtButtonPressed atButtonPressed)
	{
		buttonPressed.add(atButtonPressed, 1);
	}
	
	public void add(AtButtonReleased atButtonReleased)
	{
		buttonReleased.add(atButtonReleased);
	}
	
	public void remove(AtButtonPressed atButtonPressed)
	{
		buttonPressed.remove(atButtonPressed);
	}
	
	public void remove(AtButtonReleased atButtonReleased)
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
