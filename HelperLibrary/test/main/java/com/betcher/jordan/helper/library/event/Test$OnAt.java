package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Test$OnAt
{
	@Test
	public void equals_at1_false()
	{
		At at = mock(At.class);
		
		OnAt onAt1 = new OnAt(at);
		
		assertFalse(onAt1.equals(1));
	}
	
	@Test
	public void equals_atNull_false()
	{
		At at = mock(At.class);
		
		OnAt onAt1 = new OnAt(at);
		
		assertFalse(onAt1.equals(null));
	}
	
	@Test
	public void equals_at1At2_false()
	{
		At at1 = mock(At.class);
		At at2 = mock(At.class);
		
		OnAt onAt1 = new OnAt(at1);
		OnAt onAt2 = new OnAt(at2);
		
		assertFalse(onAt1.equals(onAt2) && onAt2.equals(onAt1));
	}
	
	@Test
	public void hashcode_at1At2_false()
	{
		At at1 = mock(At.class);
		At at2 = mock(At.class);
		
		OnAt onAt1 = new OnAt(at1);
		OnAt onAt2 = new OnAt(at2);
		
		assertFalse(onAt1.hashCode() == onAt2.hashCode());
	}
	
	@Test
	public void equals_atAt_true()
	{
		At at = mock(At.class);
		
		OnAt onAt1 = new OnAt(at);
		OnAt onAt2 = new OnAt(at);
		
		assertTrue(onAt1.equals(onAt2) && onAt2.equals(onAt1));
	}
	
	@Test
	public void hashcode_atAt_true()
	{
		At at = mock(At.class);
		
		OnAt onAt1 = new OnAt(at);
		OnAt onAt2 = new OnAt(at);
		
		assertTrue(onAt1.hashCode() == onAt2.hashCode());
	}
	
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