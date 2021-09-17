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
		
		OnCaller<Integer> onCaller = new OnCaller<>();
		onCaller.add(onA);
		onCaller.remove(onA);
		onCaller.add(onB);
		onCaller.call(object);
		
		verify(onB, times(1)).call(object);
	}
	
	@Test
	public void callAddAdd_onB_call()
	{
		int object = 0;
		On<Integer> onA = mock(On.class);
		On<Integer> onB = mock(On.class);
		
		OnCaller<Integer> onCaller = new OnCaller<>();
		onCaller.add(onA);
		onCaller.add(onB);
		onCaller.call(object);
		
		verify(onB, times(1)).call(object);
	}
	
	@Test
	public void callAddAdd_onA_Call()
	{
		int object = 0;
		On<Integer> onA = mock(On.class);
		On<Integer> onB = mock(On.class);
		
		OnCaller<Integer> onCaller = new OnCaller<>();
		onCaller.add(onA);
		onCaller.add(onB);
		onCaller.call(object);
		
		verify(onA, times(1)).call(object);
	}
	
	@Test
	public void callRemoveAdd_on_0Call()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		
		OnCaller<Integer> onCaller = new OnCaller<>();
		onCaller.add(on);
		onCaller.remove(on);
		onCaller.call(object);
		
		verify(on, times(0)).call(any());
	}
	
	@Test
	public void add_on_0Call()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		
		OnCaller<Integer> onCaller = new OnCaller<>();
		onCaller.add(on);
		
		verify(on, times(0)).call(any());
	}
	
	@Test
	public void callAdd_0on_onCall0()
	{
		int object = 0;
		On<Integer> on = mock(On.class);
		
		OnCaller<Integer> onCaller = new OnCaller<>();
		onCaller.add(on);
		onCaller.call(object);
		
		verify(on, times(1)).call(object);
	}
}