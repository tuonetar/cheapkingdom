package kingdom;

public class Eagle extends Animal implements Flying {

<<<<<<< HEAD
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
=======
	public Eagle(String name, int x, int y, double maxHealth, double health, double resistance, double maxSpeed,
			int force, boolean inAir) {
		super(name, x, y, maxHealth, health, resistance, maxSpeed, force, inAir);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void communicate() {
		System.out.println("L'aigle " + this.name + " trompète!");
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
>>>>>>> 1c15cc2e554e73af3b262c9f7047c7caf83d7a5d
	}

}
