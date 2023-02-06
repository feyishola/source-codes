public class PurchaseItem{
	private String name;
	private double unitPrice;
	
	public PurchaseItem(String name, double unitPrice){
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public PurchaseItem(){
		new PurchaseItem(null, 0.0);
	}
	public double getPrice(){
		return unitPrice;
	}
	public String toString(){
		return name+" @"+ unitPrice;
	}
	
	
	
	
}