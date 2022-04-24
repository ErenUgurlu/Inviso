package com.toyota32bit.Inviso;

import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;
import com.toyota32bit.Inviso.Services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class InvisoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvisoApplication.class, args);
	}
	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ADMIN","A"));
			userService.saveRole(new Role(null,"SUPERVISOR","S"));
			userService.saveRole(new Role(null,"REPORTER","R"));
			userService.saveRole(new Role(null,"USER","U"));

			userService.saveUser(new User(null,"sirintepe mah. pasasoylu sk. 25/7","32Bit", Date.from(Instant.now()),"DEFAULT","erentrugurlu@gmail.com","Eren","BackendDeveloper","123456","+905533312028",1,"Ugurlu","36692280490", Date.from(Instant.now()),"DEFAULT","eugurlu",true,new ArrayList<>()));

			userService.addRoleToUser("eugurlu","ADMIN");
		};
	}
}
