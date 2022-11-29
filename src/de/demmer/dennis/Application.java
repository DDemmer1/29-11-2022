package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
	
		EMail email1 = new EMail("D.D@uni-k.de","test.tt@web.de");
		email1.setText("Hallo Welt");
		String email1Text = email1.getText();

		
		EMail email2 = new EMail("Dennis.Demmer@uni-koeln.de","Test.test@web.de","Hallo Welt");
		email2.text = "Test123";
		System.out.println(email2.text);
		System.out.println(email2.recipient);
		
		String email2text = email2.getText();
		
		
		
		Item item1 = new Item();
		
		item1.setPrice(20);
		
		
		System.out.println(item1.getPrice());
		
		
		
		
	}

}
