package kingdom;

public class Archer extends Human implements DistantAttacker {

	private int dexterity;
	private int range;
	
	public Archer(String name, int x, int y, double maxHealth, double health, double resistance, double maxSpeed,
			int force, boolean inAir, int dexterity, int range) {
		super(name, x, y, maxHealth, health, resistance, maxSpeed, force, inAir);
		this.dexterity = dexterity;
		this.range = range;
	}

	@Override
	public void communicate() {
		System.out.println("L'archer " + this.name + " appelle ses compagnons");
	}
	
	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
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
		builder.append("Archer [name=");
		builder.append(name);
		builder.append(", range=");
		builder.append(range);
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
		builder.append(", dexterity=");
		builder.append(dexterity);
		builder.append(", x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void distantAttack(Being target) {
		double	distance;
		double	distanceX;
		double	distanceY;

		distanceX = this.getX() - target.getX();
		distanceY = this.getX() - target.getX();
		distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
		System.out.println("Dragon " + this.getName() + " distant attacks " + target.getName());
		if (distance <= this.getRange()) {
			target.receiveDamage(this.getDexterity());
		}
		else
			System.out.println("But it is too far.");
	}
}
