package main.java.com.betcher.jordan.helper.library.event;

import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$OnCaller
{
	@Test
	public void callCallAddAdd_ABConA2onB1_2onACall()
	{
		String object1 = "A";
		String object2 = "B";
		String object3 = "C";
		int numberOfCallsA = 2;
		int numberOfCallsB = 1;
		On<String> onA = mock(On.class);
		On<String> onB = mock(On.class);
		
		OnCaller<String> onCaller = new OnCaller<>();
		onCaller.add(onA, numberOfCallsA);
		onCaller.add(onB, numberOfCallsB);
		onCaller.call(object1);
		onCaller.call(object2);
		onCaller.call(object3);
		
		verify(onA, times(numberOfCallsA)).call(any());
	}
	
	@Test
	public void callCallAddAdd_ABConA1onB1_1onACall()
	{
		String object1 = "A";
		String object2 = "B";
		String object3 = "C";
		int numberOfCallsA = 1;
		int numberOfCallsB = 1;
		On<String> onA = mock(On.class);
		On<String> onB = mock(On.class);
		
		OnCaller<String> onCaller = new OnCaller<>();
		onCaller.add(onA, numberOfCallsA);
		onCaller.add(onB, numberOfCallsB);
		onCaller.call(object1);
		onCaller.call(object2);
		onCaller.call(object3);
		
		verify(onA, times(numberOfCallsA)).call(any());
	}
	
	@Test
	public void callCallCallAdd_ABCon2_2call()
	{
		String object1 = "A";
		String object2 = "B";
		String object3 = "C";
		int numberOfCalls = 2;
		On<String> on = mock(On.class);
		
		OnCaller<String> onCaller = new OnCaller<>();
		onCaller.add(on, numberOfCalls);
		onCaller.call(object1);
		onCaller.call(object2);
		onCaller.call(object3);
		
		verify(on, times(numberOfCalls)).call(any());
	}
	
	@Test
	public void callCallAdd_ABon1_1call()
	{
		String object1 = "A";
		String object2 = "B";
		int numberOfCalls = 1;
		On<String> on = mock(On.class);
		
		OnCaller<String> onCaller = new OnCaller<>();
		onCaller.add(on, numberOfCalls);
		onCaller.call(object1);
		onCaller.call(object2);
		
		verify(on, times(numberOfCalls)).call(any());
	}
	
	@Test
	public void callAdd_Aon1_call()
	{
		String object = "A";
		int numberOfCalls = 1;
		On<String> on = mock(On.class);
		
		OnCaller<String> onCaller = new OnCaller<>();
		onCaller.add(on, numberOfCalls);
		onCaller.call(object);
		
		verify(on, times(1)).call(object);
	}
	
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