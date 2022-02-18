package kingdom;

public abstract class MovableBeing extends Being implements Movable, Attacker {

	protected double maxSpeed;
	protected int force;
	protected boolean inAir;
	
	public MovableBeing(String name, int x, int y, double maxHealth, double health, double resistance, double maxSpeed,
			int force, boolean inAir) {
		super(name, x, y, maxHealth, health, resistance);
		this.maxSpeed = maxSpeed;
		this.force = force;
		this.inAir = inAir;
	}
	
	public abstract void communicate();

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public boolean isInAir() {
		return inAir;
	}

	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovableBeing [name=");
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
	}

	@Override
	public void goUp(double x) {
		if (x > this.getMaxSpeed())
			return ;
		this.setY(this.y + x);
		System.out.println(this.getName() + " moves Y " + this.getY());
	}

	@Override
	public void goDown(double x) {
		this.setY(-x);
		
	}

	@Override
	public void goLeft(double x) {
		if (x > this.getMaxSpeed())
			return ;
		this.setX(this.x + x);
		System.out.println(this.getName() + " moves X " + this.getX());
	}

	@Override
	public void goRight(double x) {
		this.setX(-x);
	}

	@Override
	public void attack(Being target) {
		System.out.println(this.getName() + " attacks " + target.getName());
		if (Math.abs(this.getX() - target.getX()) <= 1 ||
				Math.abs(this.getY() - target.getY()) <= 1) {
			if (target instanceof MovableBeing &&
					((MovableBeing)target).isInAir()) {
				System.out.println("But the enemy flies.");
				return ;
			}
			target.receiveDamage(force);
		}
		else
			System.out.println("But it is too far.");
	}
}
