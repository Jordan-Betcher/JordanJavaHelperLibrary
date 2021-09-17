package main.java.com.betcher.jordan.helper.library.event.examples;

public interface ExampleThirdPartyEvent
{
	int BUTTON_RELEASED = 0;
	int BUTTON_PRESSED = 1;
	void onClick(int buttonState);
}
