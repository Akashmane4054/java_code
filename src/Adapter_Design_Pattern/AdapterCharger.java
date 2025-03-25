package Adapter_Design_Pattern;

public class AdapterCharger implements AppleCharger {

	private AndroidCharger charger;

	public AdapterCharger(AndroidCharger charger) {
		super();
		this.charger = charger;
	}

	@Override
	public void chargePhone() {
		charger.chargerAndroidPhone();
		
		System.out.println("Your Phone is charging with adapter...");
	}
}
