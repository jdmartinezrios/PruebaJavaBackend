/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.pruebaJava.rest.services;

import co.edu.sena.pruebaJava.jpa.sessions.AutomovilFacade;
import co.edu.sena.pruebajava.jpa.entities.Automovil;
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
@Path("automoviles")
public class AutomovilREST {
    
    @EJB
    private AutomovilFacade automovilEJB;
    
    @GET 
    public List<Automovil> findAll(){
        return automovilEJB.findAll();
    }
    
    @GET 
    @Path("{id}")
    public Automovil findBYId(@PathParam("id") Integer id){
        return automovilEJB.find(id);
    }
    
    @POST
    public void create(Automovil automovil) {
        automovilEJB.create(automovil);
    }
  
    //dar salida
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Automovil automovil) {
        automovilEJB.edit(automovil);
    }
}