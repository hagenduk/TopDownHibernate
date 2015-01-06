/**
 * 
 */
package topdown;

import java.util.HashSet;
import java.util.Set;

/**
 * @author David
 *
 */
public class MyOrder {

	private String ORDER_ID;
	
	/**
	 * @return the oRDER_ID
	 */
	protected String getORDER_ID() {
		return ORDER_ID;
	}

	/**
	 * @param oRDER_ID the oRDER_ID to set
	 */
	protected void setORDER_ID(String oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}

	/**
	 * @return the items
	 */
	protected Set<OrderItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	protected void setItems(Set<OrderItem> items) {
		this.items = items;
	}

	private Set<OrderItem> items = new HashSet<OrderItem>();
	
	/**
	 * 
	 */
	public MyOrder(int gid) {
		this.ORDER_ID = gid + "";
	}
	
	public void aditem(OrderItem orderItem){
		items.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem){
		items.remove(orderItem);
	}
	
	public String toString(){
		String returnString = "MyOrder: ID: " + this.ORDER_ID + " \n" ;
		for(OrderItem orderItem : items){
			returnString += orderItem.toString();
		}
		return returnString;
	}
}
