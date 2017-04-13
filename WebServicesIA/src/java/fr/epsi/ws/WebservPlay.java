/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author mcfly
 */
@Path("/play")
public class WebservPlay {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WebservPlay
     */
    public WebservPlay() {
    }

    /**
     * Retrieves representation of an instance of fr.epsi.ws.WebservPlay
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{x}/{y}/{idJoueur}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

}