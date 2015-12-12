package com.mason.samples.servants;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * Created by bmason42 on 8/26/15.
 */
@Path("hello")
public class HelloJersey {
    @Context
    HttpServletRequest req;
    @Context


    @GET
    @Produces({"application/json"})
    public ResponseOne handleGet(){
        return new ResponseOne("Hello Jersey JSON " + req.getRemoteAddr() );
    }


    @GET
    @Produces({"application/xml"})
    public ResponseOne handleGetXml(){
        return new ResponseOne("Hello Jersey XML");
    }


    @GET
    @Produces({"text/html"})
    public String handleGetHtml(){
        String message = "<html><body><h1>Hello Jersey</h1></body></html>";
        return message;
    }


}
