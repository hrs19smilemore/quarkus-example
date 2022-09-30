package com.example.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorController {
    int balance;

    @Path("/balance")
    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    public int getBalance(){
        return this.balance;
    }

    @Path("/set/{balance}")
    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void setBalance(@PathParam("balance") int balance){
        this.balance = balance;
    }

    @Path("/add/{value}")
    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void add(@PathParam("value") int value){
        this.balance += value;
    }

    @Path("/minus/{value}")
    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void minus(@PathParam("value") int value){
        this.balance -= value;
    }

    @Path("/divide/{value}")
    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void divide(@PathParam("value") int value){
        this.balance /= value;
    }

    @Path("/multiply/{value}")
    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void multiply(@PathParam("value") int value){
        this.balance *= value;
    }

}
