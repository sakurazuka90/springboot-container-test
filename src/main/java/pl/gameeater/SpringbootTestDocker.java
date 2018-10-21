package pl.gameeater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class SpringbootTestDocker {
    @RequestMapping("/")
    public String home() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();

        return "Wiadomość z kontenera o ip: " + inetAddress.getHostAddress();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestDocker.class, args);
    }
}
