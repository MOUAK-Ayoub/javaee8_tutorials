package com.chap03;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;
import java.io.Serializable;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named(value = "helloWorldController")
@RequestScoped
public class HelloWorldController implements Serializable {

    private String hello;
    /**
     * Creates a new instance of HelloWorldBean
     */
    public HelloWorldController() {
    }

    @PostConstruct
    public void init(){
        System.out.println ("Instantiated helloWorldController");
        hello = "Hello World";
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