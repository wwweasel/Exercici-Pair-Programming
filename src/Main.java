import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		FlowerShop flowerShop = new FlowerShop("Awesome FlowerShop");
		
		Flower flower1 = new Flower();
		flower1.setPrice(3.99);
		flower1.setColor("Red");
		flowerShop.addFlower(flower1);
		
		Flower flower2 = new Flower();
		flower2.setPrice(2.99);
		flower2.setColor("Rosa");
		flowerShop.addFlower(flower2);
		
		Flower flower3 = new Flower();
		flower3.setPrice(2.99);
		flower3.setColor("White");
		flowerShop.addFlower(flower3);
		
		
		Decoration decoration1 = new Decoration();
		decoration1.setPrice(1.99);
		Material material = Material.PLASTIC;
		decoration1.setMaterial(material);
		flowerShop.addDecoration(decoration1);
		
		Decoration decoration2 = new Decoration();
		decoration1.setPrice(1.99);
		Material material2 = Material.WOOD;
		decoration2.setMaterial(material2);
		flowerShop.addDecoration(decoration2);
		
		Tree tree1 = new Tree();
		tree1.setPrice(13.99);
		tree1.setHeight(1.4);
		flowerShop.addTree(tree1);
		
		flowerShop.print_stock();
		
		String bla = Tree.class.getName();
		System.out.println(bla);
		
	}

}
