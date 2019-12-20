package raf.rs.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//Anotacija kojom aplikaciju pretvaramo u Zuul proxy server
@EnableZuulProxy

//Anotacija kojom omogucavamo prijavljivanje na Eureka server; @EnableEurekaClient radi samo ako na classpath-u imamo eureka dependecy
//Opstija anotacja je @EnableDiscoveryClient i radi i za druge service discavery-je (npr.ZooKeeper)
@EnableEurekaClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

}
