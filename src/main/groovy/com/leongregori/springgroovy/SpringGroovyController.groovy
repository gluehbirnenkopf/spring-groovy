package com.leongregori.springgroovy

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
public class SpringGroovyController {


    Logger logger = LoggerFactory.getLogger(SpringGroovyController.class);

    @RequestMapping(method = RequestMethod.GET, path = "/springgroovy")
    public String message() {
        logger.info("received GET request inside the Groovy Controller")
        return "Hello from Groovy Code"
    }
}