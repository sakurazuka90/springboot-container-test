package pl.gameeater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootTestDocker {
    @RequestMapping("/")
    public String home() {
        return "Nie chce mi się pracować po godzinach ale muszę. I nikt mi za to nie zapłaci.";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestDocker.class, args);
    }
}
