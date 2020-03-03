
public class Decoration extends Product{
	private Material material;

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Decoration: material = " + material + ", " + super.toString();
	}
	
}

enum Material {
	WOOD,
	PLASTIC
	};
