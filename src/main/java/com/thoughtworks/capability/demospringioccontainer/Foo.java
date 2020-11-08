package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
