public class CountedItem extends PurchaseItem{
	private int quantity;
	public CountedItem(String name, double unitPrice, int quantity){
		super(name, unitPrice);
		this.quantity = quantity;
	}

	public double getPrice(){
		return super.getPrice()* quantity;
	}
	public String toString(){
		return super.toString()+ quantity;
	}
}