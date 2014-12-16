/**
 * 
 */
package topdown;

/**
 * @author David
 *
 */
public class OrderItem {

	private int id;
	private CatalogItem catalogItem;
	private Order order;
	private String customerName;
	
	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(int id) {
		this.id = id;
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
		this.id=gid;
		this.catalogItem=gitem;
		this.order=gorder;
		this.customerName=gcustomerName;
	}
	
	public String toString(){
		String returnString = "OrderItem: ID: " + this.id + " Customer: " + this.customerName + " Catalog Item: " +catalogItem.toString();
		return returnString;
	}

}
