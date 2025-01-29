package ca.josuelubaki.ejp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.RepositoryDefinition;

@ConfigurationPropertiesScan
@SpringBootApplication
@EnableMongoRepositories(basePackages = "ca.josuelubaki.ejp.repository")
public class EjpApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjpApplication.class, args);
    }

}
