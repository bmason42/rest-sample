package com.mason.samples;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.mason.samples.servants.HelloJersey;

import org.glassfish.jersey.server.ResourceConfig;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bmason42 on 8/26/15.
 */
@ApplicationPath("v1")
public class MyApplication  extends ResourceConfig {
    static JacksonJaxbJsonProvider provider=new JacksonJaxbJsonProvider();
    public MyApplication() {

        register(provider);

        packages("com.mason.samples.servants");

    }



}
