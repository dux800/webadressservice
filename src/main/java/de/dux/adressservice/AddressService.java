package de.dux.adressservice;

import de.dux.adressservice.dto.Contact;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by doug on 30.03.17.
 */

//@Produces({ "application/json" })
@Produces({ "application/xml", "application/json" })
public interface AddressService {

    @GET
    @Path("/contacts/{id}/")
    Contact getContact(@PathParam("id") int id);

    @POST
    @Path("/contacts/")
    Response addContact(Contact contact);

    @PUT
    @Path("/contacts/")
    Response updateContact(Contact contact);

    @DELETE
    @Path("/contacts/{id}/")
    Response deleteContact(@PathParam("id") int id);

    //@GET
    //@Path("/contacts/")
    //Adresses getAllAdresses();

    //@Path("/addresses/{id}")
    //Prescription getAddresses(@PathParam("id") String prescriptionId);
}
