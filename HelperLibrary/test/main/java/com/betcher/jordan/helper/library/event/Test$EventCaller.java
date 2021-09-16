package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class Test$EventCaller
{
	@Test
	public void callAdd_0on_onCall0()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>();
		eventCaller.add(on);
		eventCaller.call(object);
		
		verify(on, times(1)).call(eventCaller);
	}
}