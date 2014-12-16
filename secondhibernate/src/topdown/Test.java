/**
 * 
 */
package topdown;

import java.math.BigDecimal;

/**
 * @author David
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		Catalog c = new Catalog(1, "pizza");
		BigDecimal bd = new BigDecimal(7.50f);
		CatalogItem ci = new CatalogItem(0, "Mozarella", "Eine Pizza mit frischem Büffel Mozzarella, verfeinert mit Tomaten und Basilikum.", bd, c);
		BigDecimal bd2 = new BigDecimal(8.00f);
		CatalogItem ci2 = new CatalogItem(0, "Hawaii", "Eine Pizza mit Annanas, Serano-Schinken, Pilzen und Mais. Mit Käserand.", bd2, c);
		c.additem(ci);
		c.additem(ci2);
		
		System.out.println(c.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();
	}

}
