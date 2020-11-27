package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}

	public ProductRepository() {
		Product phone = new Product("P1234", "IpHONE 12", 100000);
		phone.setDescription("6.1-inch, 2532X121 Super Retina XDR display, µà¾ó Ä«¸Þ¶ó");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setDescription("1000");
		phone.setCondition("New");

		Product notebook = new Product("P1235", "LG PC gram", 400000);
		notebook.setDescription("6.1-inch, 2532X121 Super Retina XDR display, µà¾ó Ä«¸Þ¶ó");
		notebook.setCategory("Smart Phone");
		notebook.setManufacturer("Apple");
		notebook.setDescription("1000");
		notebook.setCondition("New");

		Product tablet = new Product("P1236", "Galaxy Tab", 500000);
		tablet.setDescription("6.1-inch, 2532X121 Super Retina XDR display, µà¾ó Ä«¸Þ¶ó");
		tablet.setCategory("Smart Phone");
		tablet.setManufacturer("Apple");
		tablet.setDescription("1000");
		tablet.setCondition("New");

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById=product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
