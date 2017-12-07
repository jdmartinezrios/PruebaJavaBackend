/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.pruebaJava.rest.services;


import co.edu.sena.pruebaJava.jpa.sessions.ParqueaderoFacade;
import co.edu.sena.pruebaJava.jpa.entities.Parqueadero;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author adsi1261718
 */

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("parqueaderos")
public class ParqueaderoREST {
    
    @EJB
    private ParqueaderoFacade parqueaderoEJB;
    
    @GET 
    public List<Parqueadero> findAll(){
        return parqueaderoEJB.findAll();
    }
    
    @GET 
    @Path("{id}")
    public Parqueadero findBYId(@PathParam("id") Integer id){
        return parqueaderoEJB.find(id);
    }
    
    @POST
    public void create(Parqueadero parqueadero) {
        parqueaderoEJB.create(parqueadero);
    }
  
    @PUT   
    public void edit(Parqueadero parqueadero) {
        parqueaderoEJB.edit(parqueadero);
    }
}