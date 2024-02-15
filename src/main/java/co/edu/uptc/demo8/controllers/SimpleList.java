package co.edu.uptc.demo8.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.demo8.services.SimplyList;

@RestController
@RequestMapping("/simple")
public class SimpleList {

    @GetMapping("/demo1")
    public String demoList() {
        SimplyList simply = new SimplyList();
        simply.add("info");
        simply.add("info");
        simply.add("info");
        simply.add("info");
        simply.add("info");
        System.out.println("test exitoso");
        return "TEST EXITOSO";
    }
}
