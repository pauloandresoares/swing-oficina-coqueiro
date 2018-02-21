package util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class SessionFactoryHibernate {
	

	
	    
	    private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";

	    
		private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	    
	    private static final Configuration cfg = new Configuration();

	   
	    private static org.hibernate.SessionFactory sessionFactory;

	    
	    public static Session currentSession() throws HibernateException {
	        Session session = threadLocal.get();

			if (session == null || !session.isOpen()) {
				if (sessionFactory == null) {
					try {
						cfg.configure(CONFIG_FILE_LOCATION);
						sessionFactory = cfg.buildSessionFactory();
					} catch (Exception e) {
						System.err.println("%%%% Error Creating SessionFactory %%%%");
						e.printStackTrace();
					}
				}
				session = (sessionFactory != null) ? sessionFactory.openSession()
						: null;
				threadLocal.set(session);
			}

	        return session;
	    }

	    /**
	     *  Close the single hibernate session instance.
	     *
	     *  @throws HibernateException
	     */
	    public static void closeSession() throws HibernateException {
	        Session session = threadLocal.get();
	        threadLocal.set(null);

	        if (session != null) {
	            session.close();
	        }
	    }
	    
	    /**
	     * Default constructor.
	     */
	    private SessionFactoryHibernate() {
	    }

	}


	
	
	