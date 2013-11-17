// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class MenuItem implements IObject<MenuItem>{

	String name;
	int price;
	
	public MenuItem(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public boolean same(MenuItem t) {
		return (this.name.equals(t.name) &&
				this.price == t.price);
	}

	public boolean lessThan(MenuItem t) {
		return this.price < t.price;
	}

}
