package org.emsi.ejbapplication.session;

import org.emsi.ejbapplication.models.User;

import java.util.List;

public interface UserRemote {
    public User save(User o);
    public User getById(Integer o);
    public List<User> getAll();
    public void remove(Integer o);
}
