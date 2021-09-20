package main.java.com.betcher.jordan.helper.library.event.examples.at;

import main.java.com.betcher.jordan.helper.library.event.AtCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$ExampleAtCaller
{
	@Test
	public void onClick_ButtonPressed_callAtButtonPressed()
	{
		int buttonState = ExampleThirdParty.BUTTON_PRESSED;
		AtCaller atPressedCaller = mock(AtCaller.class);
		AtCaller atReleasedCaller = mock(AtCaller.class);
		
		ExampleAtCaller exampleAtCaller = new ExampleAtCaller(atPressedCaller, atReleasedCaller);
		exampleAtCaller.onClick(buttonState);
		
		verify(atPressedCaller, times(1)).call();
	}
}