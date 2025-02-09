package com.rga.controller;

import com.rga.dto.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class MessageController {

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Message> greetFromPost(@RequestBody String name) {
        return new ResponseEntity<>(new Message("Hello from post, " + name + "!"), HttpStatus.OK);
    }

    @GetMapping(value = "/{name}", produces = "application/json")
    public ResponseEntity<Message> greetFromGet(@PathVariable String name) {
        return new ResponseEntity<>(new Message("Hello " + name + "!"), HttpStatus.OK);
    }

}
