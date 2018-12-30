package dao;

import model.Personne;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IDao {
	public void save(Personne a);
	public Personne getById(Integer id);
	public List getAll();
	public void remove(Integer id);

}
