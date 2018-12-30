package service;

import model.Personne;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface IService {
	public void save(Personne a);
	public Personne getById(Integer id);
	public List<Personne> getAll();
	public void remove(Integer id);

}
