package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

class Test$EventCaller
{
	@Test
	public void __onsCreated()
	{
		EventCaller<Integer> eventCaller = new EventCaller<>();
		
		ArrayList<On<Integer>> ons = eventCaller.ons;
		assertNotNull(ons);
	}
}