import java.util.*;

public class FlowerShop {
	
	// variables
	private String shop_name;
	ArrayList<Product> decorations, trees, flowers;
	HashMap<String,ArrayList> product_list;
	
	// Constructor
	public FlowerShop(String shop_name) {
		this.shop_name = shop_name;
		
		// Create ArrayLists
		decorations = new ArrayList<Product>();
		trees = new ArrayList<Product>();
		flowers = new ArrayList<Product>();
		
		// Create HasMap and put ArrayLists into it
		product_list = new HashMap<String,ArrayList>();
		product_list.put("Decorations", decorations);
		product_list.put("Trees", trees);
		product_list.put("Flowers", flowers);
		
	}
	
	// general methods
	public void addDecoration(Decoration decoration) {
		decorations.add(decoration);
	}
	
	public void addTree(Tree tree) {
		trees.add(tree);
	}
	
	public void addFlower(Flower flower) {
		flowers.add(flower);
	}
	
	public void print_stock(){
		for(Map.Entry<String,ArrayList> entry : product_list.entrySet()) {
			String key = entry.getKey();
			ArrayList list = entry.getValue();
			
			System.out.println(key);
			for (Object obj : list) {
				System.out.println("\t" + obj);
			}
		}
	}
}
