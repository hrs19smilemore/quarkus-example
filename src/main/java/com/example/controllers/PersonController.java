package com.example.controllers;

import com.example.entities.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/person")
public class PersonController {

    @GET
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Person> getPersonList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sharven", 21));
        personList.add(new Person("Jazzy", 29));
        personList.add(new Person("Clyde", 23));

        return personList;
    }

    @GET
    @Path("json")
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Person> getPersonListInJson(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sharven", 21));
        personList.add(new Person("Jazzy", 29));
        personList.add(new Person("Clyde", 23));

        return personList;
    }

    @GET
    @Path("xml")
    @Produces(value = MediaType.APPLICATION_XML)
    public List<Person> getPersonListInXml(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sharven", 21));
        personList.add(new Person("Jazzy", 29));
        personList.add(new Person("Clyde", 23));

        return personList;
    }
}
