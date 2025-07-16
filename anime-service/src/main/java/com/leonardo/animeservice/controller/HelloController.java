package com.leonardo.animeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping(value = "greetings")
@RestController
public class HelloController {

//     forma antiga
//    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    @GetMapping(value = { "hi", "hi/"})
    public String hi() {
        return "OMAE WA MOU SHINDE IRU";
    }
}

