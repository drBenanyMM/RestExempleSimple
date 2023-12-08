package com.example;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class App {

    public static void main(String[] args) {
        URI baseUri = URI.create("http://localhost:2222/");
        ResourceConfig config = new ResourceConfig(AddResource.class);
        GrizzlyHttpServerFactory.createHttpServer(baseUri, config);
        System.out.println("Jersey app started at " + baseUri);
    }
}
