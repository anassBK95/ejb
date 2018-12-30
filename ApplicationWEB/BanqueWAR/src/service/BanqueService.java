package service;

import org.emsi.ejbapplication.models.Banque;
import org.emsi.ejbapplication.session.BanqueLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("/banque")
public class BanqueService {
    private static final long serialVersionUID = 6766329501327292893L;

    @EJB
    private BanqueLocal ejb;
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Banque save(Banque o) {
        return ejb.save(o);
    }
    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Banque getById(@PathParam(value = "id") Integer o) {
        return ejb.getById(o);
    }
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Banque> getAll() {
        return ejb.getAll();
    }
    @DELETE
    @Path("/remove/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(@PathParam(value = "id")Integer o) {
        ejb.remove(o);
    }




}
