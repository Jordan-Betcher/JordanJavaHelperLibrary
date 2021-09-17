package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$AtCaller
{
	AtCaller AtCaller(OnCaller<Void> onCaller, AtToOn atToOn)
	{
		AtCaller atCaller = new AtCaller();
		atCaller.onCaller = onCaller;
		atCaller.atToOn = atToOn;
		return atCaller;
	}
	
	@Test
	public void __atToOnNotNull()
	{
		AtCaller atCaller = new AtCaller();
		
		AtToOn actualAtToOn = atCaller.atToOn;
		assertNotNull(actualAtToOn);
	}
	
	@Test
	public void __onCallerNotNull()
	{
		AtCaller atCaller = new AtCaller();
		
		OnCaller<Void> actualOnCaller = atCaller.onCaller;
		assertNotNull(actualOnCaller);
	}
	
	@Test
	public void Add_at0_addAtAsOn0()
	{
		At at = mock(At.class);
		int numberOfCalls = 0;
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		On<Void> on = mock(On.class);
		when(atToOn.toOn(at)).thenReturn(on);
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
		atCaller.add(at, numberOfCalls);
		
		verify(onCaller, times(1)).add(on, numberOfCalls);
	}
	
	@Test
	public void Add_null1_0add()
	{
		int numberOfCalls = 1;
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
		atCaller.add(null, numberOfCalls);
		
		verify(onCaller, times(0)).add(any(), anyInt());
	}
	
	@Test
	public void remove_null_0Remove()
	{
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
		atCaller.remove(null);
		
		verify(onCaller, times(0)).remove(null);
	}
	
	@Test
	public void remove_at_removeAtAsOn()
	{
		At at = mock(At.class);
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		On<Void> on = mock(On.class);
		when(atToOn.toOn(at)).thenReturn(on);
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
		atCaller.remove(at);
		
		verify(onCaller, times(1)).remove(on);
	}
	
	@Test
	public void call__callNull()
	{
		At at = mock(At.class);
		OnCaller<Void> onCaller = mock(OnCaller.class);
		AtToOn atToOn = mock(AtToOn.class);
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
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
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
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
		
		AtCaller atCaller = AtCaller(onCaller, atToOn);
		atCaller.add(at);
		
		verify(onCaller, times(1)).add(on);
	}
}