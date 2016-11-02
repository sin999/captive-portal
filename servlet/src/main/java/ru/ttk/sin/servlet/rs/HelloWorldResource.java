package ru.ttk.sin.servlet.rs;

import entities.CursOnDate;
import ru.ttk.sin.ejbs.SimpleService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.MessageBodyWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Date;

@Stateless
@Path("/helloworld")
public class HelloWorldResource {
    @EJB
    private SimpleService simpleService;


    @GET
    @Produces({ "application/json"})
    @Path("/id/{id}")
    public CursOnDate getCurs(@PathParam("id") Long id){
        CursOnDate cursOnDate = simpleService.getCurs(id);
//        CursOnDate cursOnDate = new CursOnDate();
//        cursOnDate.setName("askldfjlask" +(simpleService==null?" service is null ":" service Not null "));
//        cursOnDate.setOnDate(new Date());
        return cursOnDate;
    }

    @POST
    @Path("/post")
    @Produces({"application/json"})
    @Consumes({MediaType.APPLICATION_JSON})
    public CursOnDate update(@BeanParam CursOnDate cursOnDate) {
        simpleService.addCurs(cursOnDate);
        return cursOnDate;
    }
}