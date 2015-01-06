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
	private MyOrder myOrder;
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
	 * @return the myOrder
	 */
	protected MyOrder getOrder() {
		return myOrder;
	}

	/**
	 * @param myOrder the myOrder to set
	 */
	protected void setOrder(MyOrder myOrder) {
		this.myOrder = myOrder;
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
	public OrderItem(int gid, CatalogItem gitem, MyOrder gorder, String gcustomerName) {
		this.ORDERITEM_ID=gid;
		this.catalogItem=gitem;
		this.myOrder=gorder;
		this.customerName=gcustomerName;
	}
	
	public String toString(){
		String returnString = "OrderItem: ID: " + this.ORDERITEM_ID + " Customer: " + this.customerName + " Catalog Item: \n" +catalogItem.toString();
		return returnString;
	}

}
