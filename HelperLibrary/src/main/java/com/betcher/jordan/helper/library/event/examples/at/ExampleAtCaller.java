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
	
	}
	
	public void add(AtButtonReleased atButtonReleased)
	{
	
	}
	
	public void remove(AtButtonPressed atButtonPressed)
	{
	
	}
	
	public void remove(AtButtonReleased atButtonReleased)
	{
	
	}
	
	@Override
	public void onClick(int buttonState)
	{
		if(buttonState == BUTTON_PRESSED) buttonPressed.call();
		if(buttonState == BUTTON_RELEASED) buttonReleased.call();
	}
}
