package yh_project.pageeventcollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PageEventCollectorApplication {
    public static void main(String[] args) {
        SpringApplication.run(PageEventCollectorApplication.class, args);
    }

}
