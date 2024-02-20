package co.edu.uptc.demo8.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.demo8.services.Node;
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

    @GetMapping("/demo1.5")
    public String demoList15() {
        List<String> hola = new ArrayList<>();
        hola.add("1");
        hola.add("2");
        hola.add("3");
        hola.add("4");
        System.out.println(hola.toString());
        hola.add(1, "100");
        System.out.println(hola.toString());
        return "TEST EXITOSO";

    }

    @GetMapping("/demo2")
    public String demoList2() {
        SimplyList simply = new SimplyList();
        simply.add("1");
        simply.add("2");
        simply.add("3");
        simply.add("4");
        simply.add("5");
        Node<T> temp = simply.getHeader();
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.getInfo() + "");
            temp = temp.getNext();
        }
        System.out.println(simply.size() + ": tamano");
        simply.add(4, "6");
        temp = simply.getHeader();
        System.out.println("---------------------");
        for (int i = 0; i < 6; i++) {
            System.out.println(temp.getInfo() + "");
            temp = temp.getNext();
        }
        System.out.println(simply.size() + ": tamano");
        System.out.println("test exitoso");
        return "TEST EXITOSO";

    }

}
