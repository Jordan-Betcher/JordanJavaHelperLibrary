package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class Test$Event
{
	@Test
	public void call_0on1on2_on1Call0()
	{
		int number = 0;
		On<Integer> on1 = mock(On.class);
		On<Integer> on2 = mock(On.class);
		
		Event<Integer> event = new Event<>();
		event.add(on1);
		event.add(on2);
		event.call(number);
		
		verify(on1, times(1)).call(number);
	}
	
	@Test
	public void call_1on_onCall1()
	{
		int number = 1;
		On<Integer> on = mock(On.class);
		
		Event<Integer> event = new Event<>();
		event.add(on);
		event.call(number);
		
		verify(on, times(1)).call(number);
	}
	
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