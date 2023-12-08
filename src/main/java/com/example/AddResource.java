package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/add")
public class AddResource {

    @GET
    @Produces ({MediaType.APPLICATION_JSON})
    public String add(@QueryParam("a") int a, @QueryParam("b") int b) {
        int result = a + b;
        return Integer.toString(result);
    }
}
