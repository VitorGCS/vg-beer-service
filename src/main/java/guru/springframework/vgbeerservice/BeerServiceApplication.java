package guru.springframework.vgbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
//@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class BeerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(BeerServiceApplication.class, args);
    }

}
