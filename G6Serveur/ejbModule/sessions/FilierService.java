package sessions;

import java.util.List;

import dao.IDao;
import entities.Filier;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name = "filiereS")
public class FilierService implements IDao<Filier> {
	@PersistenceContext 
	private EntityManager em;
	
	@Override
	public Filier create(Filier o) {
		em.persist(o);
		return o;
	}

	@Override
	public Filier delete(Filier o) {
		Filier filiere = em.find(Filier.class, o.getId());
		if(filiere != null) {
			em.remove(filiere);
		}
		return filiere;
	}

	@Override
	public Filier update(Filier o) {
		Filier filiere = em.find(Filier.class, o.getId());
		if(filiere != null) {
			filiere.setCode(filiere.getCode());
			filiere.setName(filiere.getName());
			em.merge(filiere);
			return filiere;
		}
		return null;
	}

	@Override
	public Filier findById(int id) {
		Filier filiere = em.find(Filier.class, id);
		if(filiere == null) throw new RuntimeException("Role introuvable");
		return filiere;
	}

	@Override
	public List<Filier> findAll() {
		Query query = em.createQuery("select f from Filiere f");
		return query.getResultList();
	}
}
