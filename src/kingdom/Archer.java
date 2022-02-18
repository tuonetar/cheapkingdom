package kingdom;

public class Archer extends Human implements DistantAttacker {

	@Override
	public void distantAttack() {
		// TODO Auto-generated method stub
		
	}
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


}
