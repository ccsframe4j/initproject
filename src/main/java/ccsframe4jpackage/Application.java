package ccsframe4jpackage;

import cc.creamcookie.CCSApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = { "cc.creamcookie", "ccsframe4jpackage" },
        exclude = { org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class,  })
public class Application extends CCSApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
