/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.pruebaJava.jpa.sessions;

import co.edu.sena.pruebajava.jpa.entities.Automovil;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adsi1261718
 */
@Stateless
public class AutomovilFacade extends AbstractFacade<Automovil> {

    @PersistenceContext(unitName = "co.edu.sena_PruebaJava_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutomovilFacade() {
        super(Automovil.class);
    }
    
}
