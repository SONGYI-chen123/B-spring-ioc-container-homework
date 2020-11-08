package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class GreetingController {

   @Lookup
   public GreetingService getGreetingService(){
       return null;
   }

    @GetMapping("/greet")
    public String greet() {
        return getGreetingService().sayHi();
    }

}
