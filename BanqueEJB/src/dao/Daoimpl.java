package dao;

import model.Personne;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


/**
 * Session Bean implementation class Daoimpl
 */
@Stateless
public class Daoimpl implements IDao {
	@PersistenceContext
	private EntityManager em  ;

    /**
     * Default constructor. 
     */
    public Daoimpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Personne a) {
		em.merge(a);
		
	}

	@Override
	public Personne getById(Integer id) {
		
		return em.find(Personne.class, id);
	}

	@Override
	public List<Personne> getAll() {
		
		return em.createQuery("FROM Personne").getResultList();
	}

	@Override
	public void remove(Integer id) {
		Personne a = getById(id);
		if (a!=null) {
			em.remove(a);
		}
		
	}
    
    

}
