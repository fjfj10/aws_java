package ch10_배열;

public class CustomerArrayMain {

	public static void main(String[] args) {
		Customer[] customers = new Customer[10];
		
		for(int i = 0; i < customers.length; i++) {
			String[] ratings = new String[] {"Bronze", "Silver", "Gold", "vip"};
			customers[i] = new Customer("김준" + (i + 1), ratings[i % 4]);
			
		}
		for(int i = 0; i < customers.length; i++) {
			 customers[i].showInfo();
		}

	}

}
