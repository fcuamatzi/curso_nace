package mx.com.cuamatziinc.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCourseApplication.class, args);
	}

}