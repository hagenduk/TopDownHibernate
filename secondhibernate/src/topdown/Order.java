/**
 * 
 */
package topdown;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David
 *
 */
public class Order {

	private String id;
	/**
	 * @return the id
	 */
	protected String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the items
	 */
	protected List getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	protected void setItems(List items) {
		this.items = items;
	}

	private List<OrderItem> items =new ArrayList<OrderItem>();
	
	/**
	 * 
	 */
	public Order(int gid) {
		this.id = gid + "";
	}
	
	public void aditem(OrderItem orderItem){
		items.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem){
		items.remove(orderItem);
	}
	
	public String toString(){
		String returnString = "Order: ID: " + this.id + " \n" ;
		for(OrderItem orderItem : items){
			returnString += orderItem.toString();
		}
		return returnString;
	}
}
