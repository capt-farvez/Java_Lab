public class UapBazar {
	
	public static void main(String[] args) {
		
		Product product1 = new Product("GolpoGuccho", "RT100", "Short_story", 320);
		
		double money = product1.getPrice();
		System.out.println("Price is: "+money);
		
		product1.updatePrice(400);
		money = product1.getPrice();
		System.out.println("Updated price : "+money);
		
		product1.display();
		
		double dPrice= product1.getDiscountedPrice(20);
		System.out.println("Price After discount : "+dPrice);
		
		
	}

}
