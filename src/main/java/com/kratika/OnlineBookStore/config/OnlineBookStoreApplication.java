package com.kratika.OnlineBookStore.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.kratika.OnlineBookStore")
@EntityScan(basePackages = "com.kratika.OnlineBookStore.entity")
@EnableJpaRepositories(basePackages = "com.kratika.OnlineBookStore.repository")
public class OnlineBookStoreApplication {

	static {
		System.out.println("OnlineBookStoreApplication");
		}
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

}
