package ma.fstt.aideservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AideServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AideServiceApplication.class, args);
    }

}
