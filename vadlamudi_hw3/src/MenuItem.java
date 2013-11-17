// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class MenuItem implements IObject<MenuItem>{

	// MenuItem Object Fields
	String name;
	int price;
	
	// MenuItem Object Constructor
	public MenuItem(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	// Returns true if the name, and price of this MenuItem is the same as the given MenuItem
	public boolean same(MenuItem t) {
		return (this.name.equals(t.name) &&
				this.price == t.price);
	}

	// Returns true if the price of this MenuItem is less than the given MenuItem
	public boolean lessThan(MenuItem t) {
		return this.price < t.price;
	}

}
