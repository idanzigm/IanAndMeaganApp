package com.IanAndMeaganApp.RegistryBackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(method=RequestMethod.GET, value="/api/info")
    public String getTest() {
        return "Working";
    }
}
