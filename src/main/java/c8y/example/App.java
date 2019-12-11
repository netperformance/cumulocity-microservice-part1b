package c8y.example;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cumulocity.microservice.autoconfigure.MicroserviceApplication;

@MicroserviceApplication
@RestController
public class App{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "hello " + name + "!";
    }

}