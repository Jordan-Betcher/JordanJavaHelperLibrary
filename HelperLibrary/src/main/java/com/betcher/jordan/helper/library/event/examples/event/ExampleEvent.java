package main.java.com.betcher.jordan.helper.library.event.examples.event;

import main.java.com.betcher.jordan.helper.library.event.Event;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;

public class ExampleEvent implements ExampleThirdParty
{
	private Event buttonPressed;
	private Event buttonReleased;
	
	public ExampleEvent(Event buttonPressed, Event buttonReleased)
	{
		this.buttonPressed = buttonPressed;
		this.buttonReleased = buttonReleased;
	}
	
	public void add(ExampleButtonPressedListener listener)
	{
		buttonPressed.add(listener);
	}
	
	public void add(ExampleButtonReleasedListener listener)
	{
		buttonReleased.add(listener);
	}
	
	public void remove(ExampleButtonPressedListener listener)
	{
		buttonPressed.remove(listener);
	}
	
	public void remove(ExampleButtonReleasedListener listener)
	{
		buttonReleased.remove(listener);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		if(buttonState == BUTTON_PRESSED) buttonPressed.call();
		if(buttonState == BUTTON_RELEASED) buttonReleased.call();
	}
}
