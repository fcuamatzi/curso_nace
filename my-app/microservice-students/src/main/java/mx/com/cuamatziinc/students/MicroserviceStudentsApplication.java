package mx.com.cuamatziinc.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceStudentsApplication.class, args);
	}

}
