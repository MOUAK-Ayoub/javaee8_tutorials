package com.chap03.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "helloWorldController")
@RequestScoped
public class HelloWorldController implements Serializable {
    private String hello;

    /**
     * Creates a new instance of HelloWorldBean
     */
    public HelloWorldController() {
        System.out.println("Instantiated ");

    }

    @PostConstruct
    public void init() {
        System.out.println("Instantiated helloWorldController");
        hello = "Hello World from Paris";
    }

    /**
     * @return the hello
     */
    public String getHello() {
        return hello;
    }

    /**
     * @param hello the hello to set
     */
    public void setHello(String hello) {
        this.hello = hello;
    }
}