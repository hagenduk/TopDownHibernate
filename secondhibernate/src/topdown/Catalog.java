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
public class Catalog {

	private int id;
	private String name;
	private List<CatalogItem> items = new ArrayList<CatalogItem>();
	
	/**
	 * 
	 */
	public Catalog(int gid, String gname) {
		this.name=gname;
		this.id=gid;
	}

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
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the items
	 */
	protected List<CatalogItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	protected void setItems(List<CatalogItem> items) {
		this.items = items;
	}

	public void additem(CatalogItem item){
		items.add(item);
	}
	
	public void removeItem (CatalogItem item){
		items.remove(item);
	}
	
	public String toString(){
		String returnString = "Catalog: ID: " + this.id + " Name: " + this.name + "\n";
		for(CatalogItem item : items){
			returnString += item.toString();
		}
		return returnString;
	}
	
}
