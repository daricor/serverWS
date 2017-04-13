/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.ws;

import fr.epsi.classe.Joueur;
import fr.epsi.classe.JoueurBD;
import fr.epsi.classe.Partie;
import fr.epsi.classe.PartieBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.resource.spi.UnavailableException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServiceUnavailableException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.logging.Param;

/**
 * REST Web Service
 *
 * @author mcfly
 */
@Path("/connect")
public class WebservConnect {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WebservResource
     */
    public WebservConnect() {
    }

    /**
     * Retrieves representation of an instance of fr.epsi.ws.WebservConnect
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson(@PathParam("joueurName") String joueurName) {
        
            //TODO return proper representation object

            
        if(JoueurBD.joueur1.isEtat() == false){
            
            JoueurBD.joueur1.setNomJoueur(joueurName);
            JoueurBD.joueur1.setIdJoueur("5689");
            JoueurBD.joueur1.setCode(200);
            JoueurBD.joueur1.setNumJoueur(1);
            JoueurBD.joueur1.setEtat(true);
            
            return Response.ok(JoueurBD.joueur1).build();

            
        }
        if(JoueurBD.joueur2.isEtat() == false){
            
            JoueurBD.joueur2.setNomJoueur(joueurName);
            JoueurBD.joueur2.setIdJoueur("4563");
            JoueurBD.joueur2.setCode(200);
            JoueurBD.joueur2.setNumJoueur(2);
            JoueurBD.joueur2.setEtat(true);
            
            PartieBD.partie.setEtat(true);
            
            return Response.ok(JoueurBD.joueur2).build();

        }    
        if(PartieBD.partie.getEtat() == true){
           
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }else{
            
            return Response.status(Response.Status.SERVICE_UNAVAILABLE).build();
            
        }
    
    }

}
