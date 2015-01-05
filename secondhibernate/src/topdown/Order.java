/**
 * 
 */
package topdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author David
 *
 */
public class Order {

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
	protected Set getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	protected void setItems(Set items) {
		this.items = items;
	}

	private Set items = new HashSet();
	
	/**
	 * 
	 */
	public Order(int gid) {
		this.ORDER_ID = gid + "";
	}
	
	public void aditem(OrderItem orderItem){
		items.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem){
		items.remove(orderItem);
	}
	
	public String toString(){
		String returnString = "Order: ID: " + this.ORDER_ID + " \n" ;
		for(OrderItem orderItem : (OrderItem[]) items.toArray()){
			returnString += orderItem.toString();
		}
		return returnString;
	}
}
