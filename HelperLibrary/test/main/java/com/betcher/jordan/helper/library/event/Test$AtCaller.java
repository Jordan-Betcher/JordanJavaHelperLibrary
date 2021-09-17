package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$AtCaller
{
	@Test
	public void remove_at_removeAtAsOn()
	{
		At at = mock(At.class);
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		On<Void> on = mock(On.class);
		when(atToOn.toOn(at)).thenReturn(on);
		
		AtCaller atCaller = new AtCaller(onCaller, atToOn);
		atCaller.remove(at);
		
		verify(onCaller, times(1)).remove(on);
	}
	
	@Test
	public void call__callNull()
	{
		At at = mock(At.class);
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		
		AtCaller atCaller = new AtCaller(onCaller, atToOn);
		atCaller.call();
		
		verify(onCaller, times(1)).call(null);
	}
	
	@Test
	public void Add_at1_addAtAsOn1()
	{
		At at = mock(At.class);
		int numberOfCalls = 1;
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		On<Void> on = mock(On.class);
		when(atToOn.toOn(at)).thenReturn(on);
		
		AtCaller atCaller = new AtCaller(onCaller, atToOn);
		atCaller.add(at, numberOfCalls);
		
		verify(onCaller, times(1)).add(on, numberOfCalls);
	}
	
	@Test
	public void Add_at_addAtAsOn()
	{
		At at = mock(At.class);
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		On<Void> on = mock(On.class);
		when(atToOn.toOn(at)).thenReturn(on);
		
		AtCaller atCaller = new AtCaller(onCaller, atToOn);
		atCaller.add(at);
		
		verify(onCaller, times(1)).add(on);
	}
}