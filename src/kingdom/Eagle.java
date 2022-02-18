package kingdom;

public class Eagle extends Animal implements Flying {
	
	private int vision;

	
	public Eagle(String name, int x, int y, double maxHealth, double health, double resistance, double maxSpeed,
			int force, boolean inAir, int vision) {
		super(name, x, y, maxHealth, health, resistance, maxSpeed, force, inAir);
		this.vision = vision;
	}

	@Override
	public void communicate() {
		System.out.println("L'aigle " + this.name + " tromp�te!");
	}

	@Override
	public boolean takeOff() {
		return false;
	}

	@Override
	public boolean land() {
		return false;
	}
	
	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eagle [name=");
		builder.append(name);
		builder.append(", force=");
		builder.append(force);
		builder.append(", inAir=");
		builder.append(inAir);
		builder.append(", vision=");
		builder.append(vision);
		builder.append(", health=");
		builder.append(health);
		builder.append(", resistance=");
		builder.append(resistance);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append(", x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

}
