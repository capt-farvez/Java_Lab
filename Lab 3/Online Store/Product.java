public class Product {
	public String name, id, category;
	public double price;
	
	public void updatePrice(double newPrice) {
		price=  newPrice;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDiscountedPrice(double discountPercentage) {
		double discount= price*(discountPercentage/100.00);
		return price - discount;
	}
	
	public void display() {
		System.out.printf("Name:[%s]; Id:[%s]; Category:[%s]; Price:[%.2f] \n",name,id, category,price);
	}
	
	public Product(String name, String id, String category, double price) {
		this.name = name;
		this.id = id;
		this.category = category;
		this.price= price;
	}

}
