package Adapter_Design_Pattern;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program started");
		
		AppleCharger charger = new AdapterCharger(new DKCharger());
		
		Iphone13 iphone13 = new Iphone13(charger);
		
		iphone13.chargeIphone();
	}

}
