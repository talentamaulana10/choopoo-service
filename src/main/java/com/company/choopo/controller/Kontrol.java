package main.java.com.company.choopo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/customHeader")
    ResponseEntity<String> customHeader() {
        return ResponseEntity.ok()
                .body("Custom header Package");
    }

}
