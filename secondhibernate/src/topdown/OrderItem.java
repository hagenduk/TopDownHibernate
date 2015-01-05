/**
 * 
 */
package topdown;

/**
 * @author David
 *
 */
public class OrderItem {

	private int ORDERITEM_ID;
	private CatalogItem catalogItem;
	private Order order;
	private String customerName;
	

	/**
	 * @return the oRDERITEM_ID
	 */
	protected int getORDERITEM_ID() {
		return ORDERITEM_ID;
	}

	/**
	 * @param oRDERITEM_ID the oRDERITEM_ID to set
	 */
	protected void setORDERITEM_ID(int oRDERITEM_ID) {
		ORDERITEM_ID = oRDERITEM_ID;
	}

	/**
	 * @return the catalogItem
	 */
	protected CatalogItem getCatalogItem() {
		return catalogItem;
	}

	/**
	 * @param catalogItem the catalogItem to set
	 */
	protected void setCatalogItem(CatalogItem catalogItem) {
		this.catalogItem = catalogItem;
	}

	/**
	 * @return the order
	 */
	protected Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	protected void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the customerName
	 */
	protected String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 
	 */
	public OrderItem(int gid, CatalogItem gitem, Order gorder, String gcustomerName) {
		this.ORDERITEM_ID=gid;
		this.catalogItem=gitem;
		this.order=gorder;
		this.customerName=gcustomerName;
	}
	
	public String toString(){
		String returnString = "OrderItem: ID: " + this.ORDERITEM_ID + " Customer: " + this.customerName + " Catalog Item: \n" +catalogItem.toString();
		return returnString;
	}

}
