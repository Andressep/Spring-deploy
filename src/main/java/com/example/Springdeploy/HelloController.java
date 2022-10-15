package com.example.Springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${app.message}")
    String message;

    @GetMapping("/hola")
    public String holaMundo() {
        System.out.println(message);
        return "Hola Mundo, actualizando metodos nuevamente";
    }

    @GetMapping("/")
    public String bootstrap() {
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                  </head>
                  <body>
                    <h1>Hola mundo desde Spring Boot!</h1>
                  </body>
                </html>
                """;
    }
}
