/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.pruebaJava.rest.services;

/**
 *
 * @author adsi1261718w
 */
import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

    @ApplicationPath("api")
    public class AppConfig extends ResourceConfig{
        public AppConfig(){
        packages("co.edu.sena.pruebaJava.rest.services");
    }
    }
