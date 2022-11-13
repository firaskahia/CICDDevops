package com.esprit.examen;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class TpAchatProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpAchatProjectApplication.class, args);
}
}