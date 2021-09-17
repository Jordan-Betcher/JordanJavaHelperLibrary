package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$AtCaller
{
	
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