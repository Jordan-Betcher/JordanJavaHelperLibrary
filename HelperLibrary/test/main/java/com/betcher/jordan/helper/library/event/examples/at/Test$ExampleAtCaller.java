package main.java.com.betcher.jordan.helper.library.event.examples.at;

import main.java.com.betcher.jordan.helper.library.event.AtCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$ExampleAtCaller
{
	@Test
	public void add_atButtonReleased_addAtButtonReleasedToButtonReleased()
	{
		AtButtonReleased atButtonReleased = mock(AtButtonReleased.class);
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.add(atButtonReleased);
		
		verify(atReleasedCaller, times(1)).add(atButtonReleased);
	}
	
	@Test
	public void add_atButtonPressed_addAtButtonPressedToButtonPressed()
	{
		AtButtonPressed atButtonPressed = mock(AtButtonPressed.class);
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.add(atButtonPressed);
		
		verify(atPressedCaller, times(1)).add(atButtonPressed);
	}
	
	@Test
	public void onClick_3_0callButtonReleased()
	{
		int buttonState = 3;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atReleasedCaller, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonPressed_0callButtonReleased()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atReleasedCaller, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonReleased_0callButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_RELEASED;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atPressedCaller, times(0)).call();
	}
	
	@Test
	public void __0callButtonReleased()
	{
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		
		verify(atReleasedCaller, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonReleased_callButtonReleased()
	{
		int buttonState = ExampleThirdParty.BUTTON_RELEASED;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atReleasedCaller, times(1)).call();
	}
	
	@Test
	public void onClick_3_0callButtonPressed()
	{
		int buttonState = 3;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atPressedCaller, times(0)).call();
	}
	
	@Test
	public void __0callButtonPressed()
	{
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		
		verify(atPressedCaller, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonPressed_callButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atPressedCaller, times(1)).call();
	}
}