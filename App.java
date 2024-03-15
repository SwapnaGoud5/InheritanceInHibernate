package TableperhierchyInheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtil.getSessionFactory();
        // Open a new session
        Session session = factory.openSession();
        // Begin a transaction
        Transaction t = session.beginTransaction();
        Employee emp1= new  Employee();
        emp1.setName("kalayani");
        
        Regular_Employee r1=new Regular_Employee();
        r1.setName("vikram");
        r1.setSalary("765476");
        r1.setBonus("766");
        
        Contract_Employee epm3= new Contract_Employee();
        epm3.setName("gopal");
        epm3.setContractDuration(6);
        epm3.setPay_perHR(600);
        
        session.save(emp1);
        session.save(r1);
        session.save(epm3);


        t.commit();
        session.close();
        factory.close();

    }
}
