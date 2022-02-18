package kingdom;

public class Dragon extends Animal implements Flying, DistantAttacker {

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
