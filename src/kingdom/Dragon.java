package kingdom;

public class Dragon extends Animal implements Flying, DistantAttacker {
	private int power;
	private int range;
	
	public Dragon(String name, int x, int y, double maxHealth, double health, double resistance, double maxSpeed,
			int force, boolean inAir, int power, int range) {
		super(name, x, y, maxHealth, health, resistance, maxSpeed, force, inAir);
		this.power = power;
		this.range = range;
	}

	@Override
	public void communicate() {
		System.out.println("Le dragon " + this.name + " rugit");
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dragon [name=");
		builder.append(name);
		builder.append(", range=");
		builder.append(range);
		builder.append(", power=");
		builder.append(power);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append(", force=");
		builder.append(force);
		builder.append(", inAir=");
		builder.append(inAir);
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

	@Override
	public boolean takeOff() {
		if (this.isInAir())
			return false;
		this.setInAir(true);
		return true;
	}
	
	@Override
	public boolean land() {
		if (!this.isInAir())
			return false;
		this.setInAir(false);
		return true;
	}
	
	@Override
	public void distantAttack(Being target) {
		System.out.println("Dragon " + this.getName() + " distant attacks " + target.getName());
		// TODO Auto-generated method stub
		//target.receiveDamage(this.getPower());
		
	}
}
