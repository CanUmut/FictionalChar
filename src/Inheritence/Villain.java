package Inheritence;

public class Villain extends FictionalChar{
	private String evilness;
	private static int numOfChar = 0;
	
	
	public static int getNumOfChar() {
		return numOfChar;
	}
	
	public Villain(String name, int age, double speed, int healthBar, int intelligence, int range, String weapon, String evilness) {
		super(name, age, speed, healthBar, intelligence, range, weapon);
		this.evilness = evilness;
		
		numOfChar++;
	}
	
	public void calcPower() {
		double pow;
		
		if(evilness.equalsIgnoreCase("WeakEvil"))
			this.setIntelligence(getIntelligence() + 2);
		else if(evilness.equalsIgnoreCase("Evil"))
			this.setIntelligence(getIntelligence() + 4);
		else if(evilness.equalsIgnoreCase("PureEvil"))
			this.setIntelligence(getIntelligence() + 6);
		
		pow = this.getAge()*0.1 + this.getSpeed() * 0.5 + this.getHealthBar()*0.5 + this.getIntelligence()*0.5 + this.getRange()*0.2;
		
		switch(this.getWeapon()) {
		case "PortalGun" : pow += 4.9; break;
		case "BlueFlame" : pow += 5; break;
		case "Spatula" : pow += 0.5; break;
		case "Revolver" : pow += 3; break; 
		case "Hypnotization" : pow += 3.5; break;
		case "Pistol" : pow += 3.1; break;
		case "LightSaber" : pow += 4; break;
		case "Web" : pow += 3.8; break;
		case "BatMobile" : pow += 3.9; break; 
		case "Katana" : pow += 2.9; break;
		case "Stick" : pow += 2.5; break;
		case "Wand" : pow += 3.7; break;
		case "MagicalCape" : pow += 3.6; break;
		case "Mjolnir" : pow += 4.8; break;
		case "SpearAndShield" : pow += 3.2; break;
		case "Baton" : pow += 3.8; break;
		case "TheTrident" : pow += 4.7; break;
		}
		
		pow = Math.round(pow);
		this.setPower(pow);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Evilness= " + evilness;
	}
}
