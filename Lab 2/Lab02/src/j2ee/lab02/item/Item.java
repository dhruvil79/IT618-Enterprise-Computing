package j2ee.lab02.item;

public class Item {
	int item_code,qty_in_stock,min_qty_in_stock;
	String description;
	double cost;
	
	Item(int code,String description,int qty,int min_qty,double cost)
	{
		item_code=code;
		this.description=description;
		qty_in_stock=qty;
		min_qty_in_stock=min_qty;
		this.cost=cost;
	}
	
	Item(int code,String description,double cost)
	{
		item_code=code;
		this.description=description;
		qty_in_stock=0;
		min_qty_in_stock=0;
		this.cost=cost;
	}
	
	public int getItem_code() {
		return item_code;
	}

	public int getQty_in_stock() {
		return qty_in_stock;
	}

	public int getMin_qty_in_stock() {
		return min_qty_in_stock;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}

	public void setQty_in_stock(int qty_in_stock) {
		this.qty_in_stock = qty_in_stock;
	}

	public void setMin_qty_in_stock(int min_qty_in_stock) {
		this.min_qty_in_stock = min_qty_in_stock;
	}

	public void addStock(int qty)
	{
		qty_in_stock+=qty;
	}
	
	void withdrawStock(int qty) throws InSufficientStock
	{
		if(qty_in_stock-qty<0)
		{
			 throw new InSufficientStock("InSufficientStock");    
		}
		else
		{
			qty_in_stock-=qty;
		}
	}
	
	boolean isUnderStock()
	{
		if(qty_in_stock<min_qty_in_stock)
			return true;
		return false;
	}
	public static void main(String args[]) throws InSufficientStock
	{
		{
			System.out.println("First Object");
			Item i = new Item(101,"Sticker",50,10,15);
			System.out.println("Code :"+i.getItem_code());
			System.out.println("Description :"+i.getDescription());
			System.out.println("Quantity :"+i.getQty_in_stock());
			System.out.println("Minimum Quantity :"+i.getMin_qty_in_stock());
			System.out.println("Cost :"+i.getCost());
			if(i.isUnderStock())
			{
				System.out.println("Quantity is less than minimum quantity!please increase Stock");
			}
			else
			{
				System.out.println("Quantity is Greater than minimum quantity!!!");
			}
			i.addStock(100);
			System.out.println("Withdraw Stock");
			try
			{
				i.withdrawStock(160);
			}
			catch(InSufficientStock e)
			{
				System.out.println("InSufficientStock !!please Increase Your Stock");
			}			
		}
		{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Second Object");
			Item i1 = new Item(101,"Sticker",50,10,15);
			i1.setMin_qty_in_stock(10);
			i1.setQty_in_stock(20);
			System.out.println("Code :"+i1.getItem_code());
			System.out.println("Description :"+i1.getDescription());
			System.out.println("Quantity :"+i1.getQty_in_stock());
			System.out.println("Minimum Quantity :"+i1.getMin_qty_in_stock());
			System.out.println("Cost :"+i1.getCost());
			if(i1.isUnderStock())
			{	
				System.out.println("Quantity is less than minimum quantity!please increase Stock");
			}
			else
			{
				System.out.println("Quantity is Greater than minimum quantity!!!");
			}
			i1.addStock(100);
			System.out.println("Withdraw Stock");
			try	
			{
				i1.withdrawStock(160);
			}
			catch(InSufficientStock e)
			{
				System.out.println("InSufficientStock !!please Increase Your Stock");
			}
		}

	}

}
