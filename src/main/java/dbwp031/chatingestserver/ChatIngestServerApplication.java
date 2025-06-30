package dbwp031.chatingestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ChatIngestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatIngestServerApplication.class, args);
    }

}
