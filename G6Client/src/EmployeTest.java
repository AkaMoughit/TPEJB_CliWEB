import java.util.Hashtable;  

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import dao.IDao;
import entities.User;

public class EmployeTest {
	
	@SuppressWarnings("unchecked")
	public static IDao<User> lookUpEmployeRemote() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<User>) context.lookup("ejb:/G6Serveur/userS!dao.IDao");

	}
	public static void main(String[] args) {
		try {
			IDao<User> dao = lookUpEmployeRemote();
			dao.create(new User("Abdelmoughit", "Moubarik"));
			dao.create(new User("Moubarik", "Abdelmoughit"));
			dao.create(new User("Abdelmoughit", "Moubarik"));
			
			for(User e : dao.findAll())
				System.out.println("user - " + e.getId().toString() + "\n *Nom : " + e.getLogin() + "\n *Prenom : " + e.getPassword());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
