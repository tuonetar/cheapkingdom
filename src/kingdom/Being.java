package kingdom;

public abstract class Being extends SpecialElement {
	
	private double maxHealth;
	protected double health;
	protected double resistance;
	
	public Being(String name, int x, int y, double maxHealth, double health, double resistance) {
		super(name, x, y);
		this.maxHealth = maxHealth;
		this.health = health;
		this.resistance = resistance;
	}
	
	public void receiveDamage(int damage) {
		setHealth(this.health - (damage * resistance));
	}
	
	public double getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(double maxHealth) {
		this.maxHealth = maxHealth;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getResistance() {
		return resistance;
	}

	public void setResistance(double resistance) {
		this.resistance = resistance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Being [maxHealth=");
		builder.append(maxHealth);
		builder.append(", health=");
		builder.append(health);
		builder.append(", resistance=");
		builder.append(resistance);
		builder.append(", x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}
}
