/**
 * 
 */
package topdown;

import java.math.BigDecimal;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
		createCatalog(c);
		BigDecimal bd = new BigDecimal(7.50f);
		CatalogItem ci = new CatalogItem(0, "Mozarella", "Eine Pizza mit frischem Büffel Mozzarella, verfeinert mit Tomaten und Basilikum.", bd, c);
		createCatalogItem(ci);
		BigDecimal bd2 = new BigDecimal(8.00f);
		CatalogItem ci2 = new CatalogItem(0, "Hawaii", "Eine Pizza mit Annanas, Serano-Schinken, Pilzen und Mais. Mit Käserand.", bd2, c);
		createCatalogItem(ci2);
		c.additem(ci);
		c.additem(ci2);
		
		System.out.println(c.toString());
		deleteCatalogItem(ci2);
		c.removeItem(ci2);
		System.out.println("Hawaii ist ausverkauft. Dafür gibts jetzt Premium.");
		
		BigDecimal bd3 = new BigDecimal(20.00f);
		CatalogItem ci3 = new CatalogItem(0, "Premium", "Eine Pizza mit erlesenem Serano-Schinken, Steak, Trüffeln, Kaviar, Gorgonzola und weiteren teuren Zutaten mit Goldstaub verziert. (Mit Käserand)", bd3, c);
		createCatalogItem(ci3);
		c.additem(ci3);
		
		System.out.println(c.toString());
		
		//well time to buy something
		MyOrder o = new MyOrder(1);
		createOrder(o);
		OrderItem oi = new OrderItem(0, ci3, o, "Oleksandr");
		createOrderItem(oi);
		o.aditem(oi);
		
		System.out.println(o.toString());
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();
	}
	
	
//	private static void listHoney() {
//		Transaction tx = null;
//		Session session = InitSessionFactory.getInstance().getCurrentSession();
//		try {
//			tx = session.beginTransaction();
//			List honeys = session.createQuery("select h from Honey as h")
//					.list();
//			for (Iterator iter = honeys.iterator(); iter.hasNext();) {
//				Honey element = (Honey) iter.next();
//				log.debug(element);
//			}
//			tx.commit();
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			if (tx != null && tx.isActive())
//				tx.rollback();
//
//		}
//	}

	private static void deleteCatalog(Catalog c) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.delete(c);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}

	private static void createCatalog(Catalog c) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.save(c);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}
	
	private static void deleteCatalogItem(CatalogItem c) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.delete(c);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}

	private static void createCatalogItem(CatalogItem c) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.save(c);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}

	private static void deleteOrder(MyOrder o) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.delete(o);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}

	private static void createOrder(MyOrder o) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.save(o);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}

	private static void deleteOrderItem(OrderItem o) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.delete(o);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}

	private static void createOrderItem(OrderItem o) {
		Transaction tx = null;
		Session session = InitSessionFactory.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.save(o);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (tx != null && tx.isActive())
				tx.rollback();
		}
	}
}
