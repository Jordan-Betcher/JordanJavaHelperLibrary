package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$Event
{
	@Test
	public void remove_on_removeOn()
	{
		int object = 0;
		EventCaller<Integer> eventCaller = mock(EventCaller.class);
		On<Integer> on = mock(On.class);
		
		Event<Integer> event = new Event<>(eventCaller, object);
		event.remove(on);
		
		verify(eventCaller, times(1)).remove(on);
	}
}