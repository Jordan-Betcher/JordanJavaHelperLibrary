package main.java.com.betcher.jordan.helper.library.event.examples.event;

import main.java.com.betcher.jordan.helper.library.event.Event;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class Test$ExampleEvent
{
	@Test
	public void remove_atButtonPressed_removeAtButtonPressedToButtonPressed()
	{
		ExampleButtonPressedListener buttonPressedListener = mock(ExampleButtonPressedListener.class);
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.remove(buttonPressedListener);
		
		verify(buttonPressed, times(1)).remove(buttonPressedListener);
	}
	
	@Test
	public void remove_atButtonReleased_removeAtButtonReleasedFromButtonReleased()
	{
		ExampleButtonReleasedListener buttonReleasedListener = mock(ExampleButtonReleasedListener.class);
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.remove(buttonReleasedListener);
		
		verify(buttonReleased, times(1)).remove(buttonReleasedListener);
	}
	
	@Test
	public void add_atButtonReleased_addAtButtonReleasedToButtonReleased()
	{
		ExampleButtonReleasedListener buttonReleasedListener = mock(ExampleButtonReleasedListener.class);
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.add(buttonReleasedListener);
		
		verify(buttonReleased, times(1)).add(buttonReleasedListener);
	}
	
	@Test
	public void add_atButtonPressed_addAtButtonPressedToButtonPressed()
	{
		ExampleButtonPressedListener buttonPressedListener = mock(ExampleButtonPressedListener.class);
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.add(buttonPressedListener);
		
		verify(buttonPressed, times(1)).add(buttonPressedListener);
	}
	
	@Test
	public void onClick_3_0callButtonReleased()
	{
		int buttonState = 3;
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.onClick(buttonState);
		
		verify(buttonReleased, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonPressed_0callButtonReleased()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.onClick(buttonState);
		
		verify(buttonReleased, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonReleased_0callButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_RELEASED;
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.onClick(buttonState);
		
		verify(buttonPressed, times(0)).call();
	}
	
	@Test
	public void __0callButtonReleased()
	{
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		new ExampleEvent(buttonPressed, buttonReleased);
		
		verify(buttonReleased, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonReleased_callButtonReleased()
	{
		int buttonState = ExampleThirdParty.BUTTON_RELEASED;
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.onClick(buttonState);
		
		verify(buttonReleased, times(1)).call();
	}
	
	@Test
	public void onClick_3_0callButtonPressed()
	{
		int buttonState = 3;
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.onClick(buttonState);
		
		verify(buttonPressed, times(0)).call();
	}
	
	@Test
	public void __0callButtonPressed()
	{
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		new ExampleEvent(buttonPressed, buttonReleased);
		
		verify(buttonPressed, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonPressed_callButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		Event buttonPressed = mock(Event.class);
		Event buttonReleased = mock(Event.class);
		
		ExampleEvent exampleEvent = new ExampleEvent(buttonPressed, buttonReleased);
		exampleEvent.onClick(buttonState);
		
		verify(buttonPressed, times(1)).call();
	}
}