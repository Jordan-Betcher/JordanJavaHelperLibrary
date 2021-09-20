package main.java.com.betcher.jordan.helper.library.event.examples.on;

import main.java.com.betcher.jordan.helper.library.event.OnCaller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$ExampleOnCaller
{
	@Test
	public void onClick_0_buttonCallerCall0()
	{
		int buttonState = 0;
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.onClick(buttonState);
		
		verify(buttonCaller, times(1)).call(buttonState);
	}
	
	@Test
	public void onClick_1_buttonCallerCall1()
	{
		int buttonState = 1;
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.onClick(buttonState);
		
		verify(buttonCaller, times(1)).call(buttonState);
	}
}