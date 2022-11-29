package de.demmer.dennis;

public class EMail {
	
	String text;
	String sender;
	String recipient;

	
	public EMail(String sender, String recipient) {	
		this.sender = sender;
		this.recipient = recipient;
		text = "";
	}
	
	public EMail(String sender, String recipient, String text) {
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
	}
	
	
	public String getText() {
		
		return text;
	}
	
	
	public void setText(String einAndererText) {
		
		text = einAndererText;
		
	}
	
	
	
	
	

}
