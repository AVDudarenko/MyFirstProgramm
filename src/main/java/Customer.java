public class Customer {
	String name;
	String address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void isCorrectName(Order order) {
		if (order.name.equals(name) && order.address.equals(address)) {
			System.out.println("Order is correct");
		} else {
			System.out.println("No order for this name");
		}
	}

}
