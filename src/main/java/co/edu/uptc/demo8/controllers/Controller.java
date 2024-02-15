package co.edu.uptc.demo8.controllers;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String evenGenerator() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        if (number % 2 != 0) {
            number++;
        }

        return "NUMERO PAR: " + Integer.toString(number);
    }

    public String oddGenerator() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        if (number % 2 == 0) {
            number++;
        }

        return "NUMERO IMPAR: " + Integer.toString(number);
    }

    public void objGenerator() {

    }
}
