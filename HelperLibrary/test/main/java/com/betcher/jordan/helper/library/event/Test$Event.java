package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$Event
{
	@Test
	public void add_listener_0call()
	{
		Listener listener = mock(Listener.class);
		
		Event event = new Event();
		event.add(listener);
		
		verify(listener, times(0)).call();
	}
	
	@Test
	public void callAdd_listener_call()
	{
		Listener listener = mock(Listener.class);
		
		Event event = new Event();
		event.add(listener);
		event.call();
		
		verify(listener, times(1)).call();
	}
}