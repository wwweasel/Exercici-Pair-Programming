
public class Tree extends Product{
	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double d) {
		this.height = d;
	}
	
	@Override
	public String toString() {
		return "Tree: height = " + height + ", " + super.toString();
	}
	
}
