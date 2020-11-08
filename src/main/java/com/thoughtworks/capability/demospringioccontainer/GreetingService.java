package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class GreetingService {

    String sayHi() {
        return "hello world";
    }
}
