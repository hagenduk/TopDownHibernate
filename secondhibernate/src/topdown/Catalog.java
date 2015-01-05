/**
 * 
 */
package topdown;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author David
 *
 */
public class Catalog {

	private int CATALOG_ID;
	private String name;
	private Set items = new HashSet();
	
	/**
	 * 
	 */
	public Catalog(int gid, String gname) {
		this.name=gname;
		this.CATALOG_ID=gid;
	}

	
	/**
	 * @return the cATALOG_ID
	 */
	protected int getCATALOG_ID() {
		return CATALOG_ID;
	}


	/**
	 * @param cATALOG_ID the cATALOG_ID to set
	 */
	protected void setCATALOG_ID(int cATALOG_ID) {
		CATALOG_ID = cATALOG_ID;
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
	protected Set getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	protected void setItems(Set items) {
		this.items = items;
	}

	public void additem(CatalogItem item){
		items.add(item);
	}
	
	public void removeItem (CatalogItem item){
		items.remove(item);
	}
	
	public String toString(){
		String returnString = "Catalog: ID: " + this.CATALOG_ID + " Name: " + this.name + "\n";
		for(CatalogItem item : (CatalogItem[]) items.toArray()){
			returnString += item.toString();
		}
		return returnString;
	}
	
}
