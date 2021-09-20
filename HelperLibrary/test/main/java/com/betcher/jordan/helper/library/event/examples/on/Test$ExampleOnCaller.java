package main.java.com.betcher.jordan.helper.library.event.examples.on;

import main.java.com.betcher.jordan.helper.library.event.OnCaller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$ExampleOnCaller
{
	@Test
	public void remove_onButtonChange_removeOnButtonChangeToButtonCaller()
	{
		OnButtonChange onButtonChange = mock(OnButtonChange.class);
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.remove(onButtonChange);
		
		verify(buttonCaller, times(1)).remove(onButtonChange);
	}
	
	@Test
	public void add_onButtonChange_addOnButtonChangeToButtonCaller()
	{
		OnButtonChange onButtonChange = mock(OnButtonChange.class);
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.add(onButtonChange);
		
		verify(buttonCaller, times(1)).add(onButtonChange);
	}
	
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