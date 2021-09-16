package main.java.com.betcher.jordan.helper.library.event;


import java.util.ArrayList;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

class Test$EventCaller
{
	@Test
	public void __onsCreated()
	{
		EventCaller<Integer> eventCaller = new EventCaller<>();
		
		ArrayList<On<Integer>> ons = eventCaller.ons;
		Assertions.assertNotNull(ons);
	}
}