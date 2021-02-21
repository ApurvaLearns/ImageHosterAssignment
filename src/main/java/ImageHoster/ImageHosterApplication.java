package ImageHoster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//
// @SpringBootApplication

@SpringBootApplication(scanBasePackages={"ImageHoster"})

public class ImageHosterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageHosterApplication.class, args);
    }
}
