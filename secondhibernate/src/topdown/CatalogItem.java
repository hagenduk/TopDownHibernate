/**
 * 
 */
package topdown;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

/**
 * @author David
 *
 */
public class CatalogItem {

	private int id;
	private String name;
	private String description;
	private BigDecimal price;
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
	 * @return the description
	 */
	protected String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	protected void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	protected BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	protected void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the catalog
	 */
	protected Catalog getCatalog() {
		return catalog;
	}

	/**
	 * @param catalog the catalog to set
	 */
	protected void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	/**
	 * @return the numberFormat
	 */
	protected NumberFormat getNumberFormat() {
		return numberFormat;
	}

	/**
	 * @param numberFormat the numberFormat to set
	 */
	protected void setNumberFormat(NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
	}

	/**
	 * @return the currencyFormat
	 */
	protected NumberFormat getCurrencyFormat() {
		return currencyFormat;
	}

	/**
	 * @param currencyFormat the currencyFormat to set
	 */
	protected void setCurrencyFormat(NumberFormat currencyFormat) {
		this.currencyFormat = currencyFormat;
	}

	private Catalog catalog;
	private NumberFormat numberFormat = DecimalFormat.getNumberInstance(Locale.GERMANY);
	private NumberFormat currencyFormat = DecimalFormat.getCurrencyInstance(Locale.GERMANY);
	
	/**
	 * 
	 */
	public CatalogItem(int gid, String gname, String gdescription, BigDecimal gprice, Catalog gcatalog) {
		this.id= gid;
		this.name=gname;
		this.description = gdescription;
		this.price=gprice;
		this.catalog=gcatalog;
	}
	
	public String getPriceString(){
		String returnString = "";
		returnString+= numberFormat.format(price);
		returnString += currencyFormat.getCurrency();
		return returnString;	
	}
	
	public Number parsePriceString(String input) throws ParseException{
		Number price = numberFormat.parse(input);
		return price;
	}
	
	public String toString(){
		String returnString = "CatalogItem: ID: " + this.id + " Name: " + this.name + " Price: " + this.getPriceString() + "\n";
		return returnString;
	}

}
