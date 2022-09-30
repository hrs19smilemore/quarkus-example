package com.example.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorController {

    @Path("/add/{firstValue}/{secondValue}")
    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    @Consumes(value = MediaType.TEXT_PLAIN)
    public int add(@PathParam("firstValue") int firstValue, @PathParam("secondValue") int secondValue){
        return firstValue + secondValue;
    }

    @Path("/minus/{firstValue}/{secondValue}")
    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    @Consumes(value = MediaType.TEXT_PLAIN)
    public int minus(@PathParam("firstValue") int firstValue, @PathParam("secondValue") int secondValue){
        return firstValue - secondValue;
    }

    @Path("/divide/{firstValue}/{secondValue}")
    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    @Consumes(value = MediaType.TEXT_PLAIN)
    public int divide(@PathParam("firstValue") int firstValue, @PathParam("secondValue") int secondValue){
        return firstValue / secondValue;
    }

    @Path("/multiply/{firstValue}/{secondValue}")
    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    @Consumes(value = MediaType.TEXT_PLAIN)
    public int multiply(@PathParam("firstValue") int firstValue, @PathParam("secondValue") int secondValue){
        return firstValue * secondValue;
    }

}
