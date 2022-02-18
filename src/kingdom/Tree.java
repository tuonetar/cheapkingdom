package kingdom;

public class Tree extends Being {

	public Tree(String name, int x, int y, double maxHealth, double health, double resistance) {
		super(name, x, y, maxHealth, health, resistance);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tree [name=");
		builder.append(name);
		builder.append(", resistance=");
		builder.append(resistance);
		builder.append(", health=");
		builder.append(health);
		builder.append(", x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

}
