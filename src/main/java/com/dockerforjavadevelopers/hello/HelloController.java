package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public Map<String, String> index() {
    	HashMap<String, String> map = new HashMap<>();
        map.put("result", "Hello World from java");
        return map;
    }
    
}
