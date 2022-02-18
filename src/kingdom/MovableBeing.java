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
		builder.append("MovableBeing [maxSpeed=");
		builder.append(maxSpeed);
		builder.append(", force=");
		builder.append(force);
		builder.append(", inAir=");
		builder.append(inAir);
		builder.append("]");
		return builder.toString();
	}
	

	@Override
	public void goUp(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goDown(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goLeft(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goRight(double x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Being target) {
		// TODO Auto-generated method stub
		
	}
}
