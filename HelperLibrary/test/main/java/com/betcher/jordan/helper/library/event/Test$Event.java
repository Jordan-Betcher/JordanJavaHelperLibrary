package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$Event
{
	@Test
	public void callAddAdd_listener1Listener2_listener1Call()
	{
		Listener listener1 = mock(Listener.class);
		Listener listener2 = mock(Listener.class);
		
		Event event = new Event();
		event.add(listener1);
		event.add(listener2);
		event.call();
		
		verify(listener1, times(1)).call();
	}
	
	@Test
	public void callRemoveAdd_listener_0call()
	{
		Listener listener = mock(Listener.class);
		
		Event event = new Event();
		event.add(listener);
		event.remove(listener);
		event.call();
		
		verify(listener, times(0)).call();
	}
	
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