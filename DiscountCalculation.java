package HomeWork;

public class DiscountCalculation {
	public static void main(String[]args) {
	int price=2000;
	int discount=20;
	int tax=10;
	int netPrice=price-(price*discount/100)+(price*tax/100);
	System.out.println(netPrice);
	
	}

}