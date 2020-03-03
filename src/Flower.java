
public class Flower extends Product{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Flower: color = " + color + ", " + super.toString();
	}
}
