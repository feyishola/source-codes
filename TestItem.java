public class TestItem{
		public static void main(String[]args){
			PurchaseItem item1 = new WeighedItem("Banana", 100.0, 10.0);
			PurchaseItem item2 = new CountedItem("Mango", 500.0, 50);
			
			
			System.out.println(item1);
			System.out.println(item2);
			
		}
	
	
	
}