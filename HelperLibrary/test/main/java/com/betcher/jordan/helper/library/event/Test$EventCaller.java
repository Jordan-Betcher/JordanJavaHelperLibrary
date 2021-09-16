package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

class Test$EventCaller
{
	@Test
	public void callAddRemoveAdd_onB_call()
	{
		int object = 0;
		On<Integer> onA = mock(On.class);
		On<Integer> onB = mock(On.class);
		Event event = mock(Event.class);
		EventFactory eventFactory = mock(EventFactory.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>(eventFactory);
		eventCaller.add(onA);
		eventCaller.remove(onA);
		eventCaller.add(onB);
		when(eventFactory.createEvent(eventCaller, object)).thenReturn(event);
		eventCaller.call(object);
		
		verify(onB, times(1)).call(event);
	}
	
	@Test
	public void callAddAdd_onB_call()
	{
		int object = 0;
		On<Integer> onA = mock(On.class);
		On<Integer> onB = mock(On.class);
		Event event = mock(Event.class);
		EventFactory eventFactory = mock(EventFactory.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>(eventFactory);
		eventCaller.add(onA);
		eventCaller.add(onB);
		when(eventFactory.createEvent(eventCaller, object)).thenReturn(event);
		eventCaller.call(object);
		
		verify(onB, times(1)).call(event);
	}
	
	@Test
	public void callAddAdd_onA_Call()
	{
		int object = 0;
		On<Integer> onA = mock(On.class);
		On<Integer> onB = mock(On.class);
		Event event = mock(Event.class);
		EventFactory eventFactory = mock(EventFactory.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>(eventFactory);
		eventCaller.add(onA);
		eventCaller.add(onB);
		when(eventFactory.createEvent(eventCaller, object)).thenReturn(event);
		eventCaller.call(object);
		
		verify(onA, times(1)).call(event);
	}
	
	@Test
	public void callRemoveAdd_on_0Call()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		Event event = mock(Event.class);
		EventFactory eventFactory = mock(EventFactory.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>(eventFactory);
		eventCaller.add(on);
		eventCaller.remove(on);
		when(eventFactory.createEvent(eventCaller, object)).thenReturn(event);
		eventCaller.call(object);
		
		verify(on, times(0)).call(any());
	}
	
	@Test
	public void add_on_0Call()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		Event event = mock(Event.class);
		EventFactory eventFactory = mock(EventFactory.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>(eventFactory);
		eventCaller.add(on);
		
		verify(on, times(0)).call(any());
	}
	
	@Test
	public void callAdd_0on_onCall0()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		Event event = mock(Event.class);
		EventFactory eventFactory = mock(EventFactory.class);
		
		EventCaller<Integer> eventCaller = new EventCaller<>(eventFactory);
		eventCaller.add(on);
		when(eventFactory.createEvent(eventCaller, object)).thenReturn(event);
		eventCaller.call(object);
		
		verify(on, times(1)).call(event);
	}
}