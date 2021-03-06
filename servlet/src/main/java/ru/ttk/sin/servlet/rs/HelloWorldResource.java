package ru.ttk.sin.servlet.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorldResource {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/plain")
//    @Produces({"application/xml", "application/json"})
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
}