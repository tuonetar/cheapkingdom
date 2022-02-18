package kingdom;

public class Eagle extends Animal implements Flying {

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

}
