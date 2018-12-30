package org.emsi.ejbapplication.session;

import org.emsi.ejbapplication.models.Banque;

import java.util.List;

public interface BanqueLocal {
    public Banque save(Banque o);
    public Banque getById(Integer o);
    public List<Banque> getAll();
    public void remove(Integer o);
}
