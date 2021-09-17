package main.java.com.betcher.jordan.helper.library.event.examples;

import main.java.com.betcher.jordan.helper.library.event.Event;

public class ExampleEvent implements ExampleThirdPartyEvent
{
	private Event eventButtonPressed;
	private Event eventButtonReleased;
	
	public ExampleEvent(Event eventButtonPressed, Event eventButtonReleased)
	{
		this.eventButtonPressed = eventButtonPressed;
		this.eventButtonReleased = eventButtonReleased;
	}
	
	public void add(ExampleButtonPressedListener listener)
	{
		eventButtonPressed.add(listener);
	}
	
	public void add(ExampleButtonReleasedListener listener)
	{
		eventButtonReleased.add(listener);
	}
	
	public void remove(ExampleButtonPressedListener listener)
	{
		eventButtonPressed.remove(listener);
	}
	
	public void remove(ExampleButtonReleasedListener listener)
	{
		eventButtonPressed.remove(listener);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		switch(buttonState)
		{
			case ExampleThirdPartyEvent.BUTTON_PRESSED -> eventButtonPressed.call();
			case ExampleThirdPartyEvent.BUTTON_RELEASED -> eventButtonReleased.call();
		}
	}
}
