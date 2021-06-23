package com.example.routingsimple.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CodingController {
    @RequestMapping("/coding")
    // 3. Method that maps to the request route above
    public String random() { // 3
            return "Hello Coding Dojo";
    }
    @RequestMapping("/coding/python")
    // 3. Method that maps to the request route above
    public String pythonString() { // 3
            return "Python/Django was awesome!";
    }
    @RequestMapping("/coding/java")
    // 3. Method that maps to the request route above
    public String javaString() { // 3
            return "Java/Spring is better!";
    }

}
