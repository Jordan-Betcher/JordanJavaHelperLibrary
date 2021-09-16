package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class Test$Event
{
	@Test
	public void call_Aon_onCallA()
	{
		String string = "A";
		On<String> on = mock(On.class);
		
		Event<String> event = new Event<>();
		event.add(on);
		event.call(string);
		
		verify(on, times(1)).call(string);
	}
	
	@Test
	public void call_0on_onCall0()
	{
		int number = 0;
		On<Integer> on = mock(On.class);
		
		Event<Integer> event = new Event<>();
		event.add(on);
		event.call(number);
		
		verify(on, times(1)).call(number);
	}
}