package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@RestController
public class GreetingController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    public GreetingController(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    private GreetingService getGreetingService(){
        return applicationContext.getBean(GreetingService.class);
    }

    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
