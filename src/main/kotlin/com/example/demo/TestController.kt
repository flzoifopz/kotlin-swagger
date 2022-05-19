package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test", produces = ["application/json;charset=utf-8"])
    fun findProductsBySku(): ResponseEntity<String> {

     return   ResponseEntity.ok("test");
    }
        
    

}