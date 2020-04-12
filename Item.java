import java.util.List;

class Item {
	int id;
	String name;
	double price;
	float tax = 0.15;
	//TODO add variable.
	Constructor(id, name, price){
		this.id = id;
		this.name = name;
		this.price=price;
	}
	int getId(){
		return id;
	}

	String getName(){
		return name;
	}

	double getPrice(){
		return price;
	}
	//TODO setters and getters

	double taxReturn () {
		return tax * getPrice();
	}
}

class Receipt{

	List<Item> item1 = milk;
	List<Item> item2 = sugar;

	
}