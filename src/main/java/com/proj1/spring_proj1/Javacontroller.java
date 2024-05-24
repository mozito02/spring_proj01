package com.proj1.spring_proj1;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class SpringProj1Application {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringProj1Application.class, args);
// 	}

// }
// package com.proj1.spring_proj1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Javacontroller {
    @RestController
    public class HelloWorldController {
        @RequestMapping("/api")
        public String index() {
            return "Greetings from Spring Boot!";
        }
    }
}
