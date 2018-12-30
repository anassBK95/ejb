package org.emsi.ejbapplication.session;

import org.emsi.ejbapplication.models.Banque;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "BanqueEJB")
public class BanqueEJBBean implements BanqueLocal,BanqueRemote{
    @PersistenceContext(unitName = "persist")
    private EntityManager em;

    @Override
    public Banque save(Banque o) {
        em.merge(o);
        return o;
    }

    @Override
    public Banque getById(Integer o) {
        return em.find(Banque.class,o);
    }

    @Override
    public List<Banque> getAll() {
        return em.createQuery("select B from Banque B").getResultList();
    }

    @Override
    public void remove(Integer o) {
         Banque B=getById(o);
         em.remove(o);
    }
}
