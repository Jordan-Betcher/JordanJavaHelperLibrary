package main.java.com.betcher.jordan.helper.library.event.examples.at;

import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class Test$ExampleAtCaller
{
	@Test
	public void addOneCall_atButtonPressed_addAtButtonPressed1ToButtonPressed()
	{
		ExampleAtButtonPressed atButtonPressed = mock(ExampleAtButtonPressed.class);
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.addOneCall(atButtonPressed);
		
		verify(buttonPressed, times(1)).add(atButtonPressed, 1);
	}
	
	@Test
	public void remove_atButtonPressed_removeAtButtonPressedToButtonPressed()
	{
		ExampleAtButtonPressed atButtonPressed = mock(ExampleAtButtonPressed.class);
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.remove(atButtonPressed);
		
		verify(buttonPressed, times(1)).remove(atButtonPressed);
	}
	
	@Test
	public void remove_atButtonReleased_removeAtButtonReleasedFromButtonReleased()
	{
		ExampleAtButtonReleased atButtonReleased = mock(ExampleAtButtonReleased.class);
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.remove(atButtonReleased);
		
		verify(buttonReleased, times(1)).remove(atButtonReleased);
	}
	
	@Test
	public void add_atButtonReleased_addAtButtonReleasedToButtonReleased()
	{
		ExampleAtButtonReleased atButtonReleased = mock(ExampleAtButtonReleased.class);
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.add(atButtonReleased);
		
		verify(buttonReleased, times(1)).add(atButtonReleased);
	}
	
	@Test
	public void add_atButtonPressed_addAtButtonPressedToButtonPressed()
	{
		ExampleAtButtonPressed atButtonPressed = mock(ExampleAtButtonPressed.class);
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.add(atButtonPressed);
		
		verify(buttonPressed, times(1)).add(atButtonPressed);
	}
	
	@Test
	public void onClick_3_0callButtonReleased()
	{
		int buttonState = 3;
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.onClick(buttonState);
		
		verify(buttonReleased, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonPressed_0callButtonReleased()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.onClick(buttonState);
		
		verify(buttonReleased, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonReleased_0callButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_RELEASED;
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.onClick(buttonState);
		
		verify(buttonPressed, times(0)).call();
	}
	
	@Test
	public void __0callButtonReleased()
	{
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		new ExampleAtCaller(buttonPressed, buttonReleased);
		
		verify(buttonReleased, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonReleased_callButtonReleased()
	{
		int buttonState = ExampleThirdParty.BUTTON_RELEASED;
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.onClick(buttonState);
		
		verify(buttonReleased, times(1)).call();
	}
	
	@Test
	public void onClick_3_0callButtonPressed()
	{
		int buttonState = 3;
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.onClick(buttonState);
		
		verify(buttonPressed, times(0)).call();
	}
	
	@Test
	public void __0callButtonPressed()
	{
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		new ExampleAtCaller(buttonPressed, buttonReleased);
		
		verify(buttonPressed, times(0)).call();
	}
	
	@Test
	public void onClick_ButtonPressed_callButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		AtCaller buttonPressed = mock(AtCaller.class);
		AtCaller buttonReleased = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(buttonPressed, buttonReleased);
		exampleAtCaller.onClick(buttonState);
		
		verify(buttonPressed, times(1)).call();
	}
}