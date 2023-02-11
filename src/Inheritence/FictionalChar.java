package Inheritence;
import java.util.Objects;

public abstract class FictionalChar implements Comparable<FictionalChar>{
	private String name;
	private int age;
	private double speed;
	private int healthBar;
	private int intelligence;
	private int range;
	private String weapon;
	private double power;
	
	
	
	public FictionalChar() {
		
	}

	public FictionalChar(String name, int age, double speed, int healthBar, int intelligence, int range, String weapon) {
		this.name = name;
		this.age = age;
		this.speed = speed;
		this.healthBar = healthBar;
		this.intelligence = intelligence;
		this.range = range;
		this.weapon = weapon;
		
		
	}

	public abstract void calcPower();
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getHealthBar() {
		return healthBar;
	}

	public void setHealthBar(int healthBar) {
		this.healthBar = healthBar;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, healthBar, intelligence, name, power, range, speed, weapon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FictionalChar other = (FictionalChar) obj;
		return age == other.age && healthBar == other.healthBar && intelligence == other.intelligence
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(power) == Double.doubleToLongBits(other.power) && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed)
				&& Objects.equals(weapon, other.weapon);
	}

	@Override
	public String toString() {
		return "\nFictionalChar \nName= " + name + "\nAge= " + age + "\nSpeed= " + speed + "\nHealth Bar= " + healthBar
				+ "\nIntelligence= " + intelligence + "\nRange= " + range + "\nWeapon= " + weapon + "\nPower=" + power
				+ "\n";
	}

	@Override
	public int compareTo(FictionalChar o) {
		return  (int)o.getPower() - (int)this.power;
	}
}
