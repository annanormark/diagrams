package codeE1;

public class Scheduler {
	private Preferences preferenceResponder;
	private Preferences preferenceRequester;
	
	public Boolean isResponderAvailable() {
		return true;
	}
	
	public Boolean notifyResponse() {
		return true;
	}
	
	public Boolean sendRequestToResponder() {
		return true;
	}
	
	public Boolean sendFeedback() {
		return true;
	}
}
