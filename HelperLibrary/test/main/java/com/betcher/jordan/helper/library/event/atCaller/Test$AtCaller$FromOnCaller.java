package main.java.com.betcher.jordan.helper.library.event.atCaller;

import main.java.com.betcher.jordan.helper.library.event.atCaller.At;
import main.java.com.betcher.jordan.helper.library.event.atCaller.AtCaller;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class Test$AtCaller$FromOnCaller
{
	//Breaks when OnAt equals not implemented
	//Breaks when OnAt hashcode not implemented
	@Test
	public void callRemoveAdd_Aat1On_0Call()
	{
		int numberOfCalls = 1;
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at, numberOfCalls);
		atCaller.remove(at);
		atCaller.call();
		
		verify(at, times(0)).call();
	}
	
	@Test
	public void callCallAddAdd_ABatA2atB1_1atBCall()
	{
		int numberOfCallsA = 2;
		int numberOfCallsB = 1;
		At atA  = mock(At.class);
		At atB  = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(atA, numberOfCallsA);
		atCaller.add(atB, numberOfCallsB);
		atCaller.call();
		atCaller.call();
		
		verify(atB, times(numberOfCallsB)).call();
	}
	
	@Test
	public void callCallAddAdd_ABatA2atB1_2atACall()
	{
		int numberOfCallsA = 2;
		int numberOfCallsB = 1;
		At atA  = mock(At.class);
		At atB  = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(atA, numberOfCallsA);
		atCaller.add(atB, numberOfCallsB);
		atCaller.call();
		atCaller.call();
		
		verify(atA, times(numberOfCallsA)).call();
	}
	
	@Test
	public void callCallAddAdd_ABCatA1atB1_1atACall()
	{
		int numberOfCallsA = 1;
		int numberOfCallsB = 1;
		At atA = mock(At.class);
		At atB = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(atA, numberOfCallsA);
		atCaller.add(atB, numberOfCallsB);
		atCaller.call();
		atCaller.call();
		atCaller.call();
		
		verify(atA, times(numberOfCallsA)).call();
	}
	
	@Test
	public void callCallCallAdd_ABCat2_2call()
	{
		int numberOfCalls = 2;
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at, numberOfCalls);
		atCaller.call();
		atCaller.call();
		atCaller.call();
		
		verify(at, times(numberOfCalls)).call();
	}
	
	@Test
	public void callCallAdd_ABat1_1call()
	{
		int numberOfCalls = 1;
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at, numberOfCalls);
		atCaller.call();
		atCaller.call();
		
		verify(at, times(numberOfCalls)).call();
	}
	
	@Test
	public void callAdd_Aat1_call()
	{
		int numberOfCalls = 1;
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at, numberOfCalls);
		atCaller.call();
		
		verify(at, times(1)).call();
	}
	
	@Test
	public void callAddRemoveAdd_atB_call()
	{
		At atA = mock(At.class);
		At atB = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(atA);
		atCaller.remove(atA);
		atCaller.add(atB);
		atCaller.call();
		
		verify(atB, times(1)).call();
	}
	
	@Test
	public void callAddAdd_atB_call()
	{
		At atA = mock(At.class);
		At atB = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(atA);
		atCaller.add(atB);
		atCaller.call();
		
		verify(atB, times(1)).call();
	}
	
	@Test
	public void callAddAdd_atA_Call()
	{
		At atA = mock(At.class);
		At atB = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(atA);
		atCaller.add(atB);
		atCaller.call();
		
		verify(atA, times(1)).call();
	}
	
	//Breaks when OnAt equals not implemented
	@Test
	public void callRemoveAdd_atAt_0Call()
	{
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at);
		atCaller.remove(at);
		atCaller.call();
		
		verify(at, times(0)).call();
	}
	
	@Test
	public void add_at_0Call()
	{
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at);
		
		verify(at, times(0)).call();
	}
	
	@Test
	public void callAdd_0at_atCall()
	{
		At at = mock(At.class);
		
		AtCaller atCaller = new AtCaller();
		atCaller.add(at);
		atCaller.call();
		
		verify(at, times(1)).call();
	}
}