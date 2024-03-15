package TableperhierchyInheritence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
	try {
	return new
	Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Employee.class)
	.addAnnotatedClass(Contract_Employee.class).addAnnotatedClass(Regular_Employee.class)
	.buildSessionFactory();
	
	} catch (Throwable ex) {
	throw new ExceptionInInitializerError(ex);
	}
	}
	public static SessionFactory getSessionFactory() {
	return sessionFactory;
	}

}
