package org.emsi.ejbapplication.session;

import org.emsi.ejbapplication.models.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "UserEJB")
public class UserEJBBean implements UserLocal,UserRemote {
    @PersistenceContext(unitName = "persist")
    private EntityManager em;
    
    
    @Override
    public User save(User o) {
        return em.merge(o);
    }

    @Override
    public User getById(Integer o) {
        return em.find(User.class,o);
    }

    @Override
    public List<User> getAll() {
        return em.createQuery("select U from User U").getResultList();
    }

    @Override
    public void remove(Integer o) {
        User obj =getById(o);
        if (obj!=null)
            em.remove(obj);
    }
}
