package service;

import dao.IDao;
import model.Personne;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;


/**
 * Session Bean implementation class Serviceimpl
 */
@Stateless
public class Serviceimpl implements IService {

	@EJB
	private IDao dao;

	/**
	 * Default constructor.
	 */

	@Override
	public void save(Personne a) {
		dao.save(a);
		;

	}

	@Override
	public Personne getById(Integer id) {

		return dao.getById(id);
	}

	@Override
	public List<Personne> getAll() {

		return dao.getAll();
	}

	@Override
	public void remove(Integer id) {
		Personne a = getById(id);
		if (a != null) {
			dao.remove(id);
		}
	}
}
