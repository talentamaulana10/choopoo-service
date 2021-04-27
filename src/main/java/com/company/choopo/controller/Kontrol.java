package com.company.choopo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Kontrol {

    @GetMapping("/HelloWorld")
    public  String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/HelloWorld/{name}")
    public String HelloWorldName(@PathVariable(value="name") String name){
        return "Hellow " + name;
    }

    @GetMapping
    public ResponseEntity<?> kata() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/customHeader")
    ResponseEntity<String> customHeader() {
        return ResponseEntity.ok()
                .body("Custom header Package");
    }

}
