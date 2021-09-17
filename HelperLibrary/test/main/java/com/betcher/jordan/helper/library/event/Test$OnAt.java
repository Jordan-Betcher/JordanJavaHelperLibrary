package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$OnAt
{
	@Test
	public void __0call()
	{
		At at = mock(At.class);
		
		OnAt onAt = new OnAt(at);
		
		verify(at, times(0)).call();
	}
	
	@Test
	public void call__call()
	{
		At at = mock(At.class);
		
		OnAt onAt = new OnAt(at);
		onAt.call(null);
		
		verify(at, times(1)).call();
	}
}