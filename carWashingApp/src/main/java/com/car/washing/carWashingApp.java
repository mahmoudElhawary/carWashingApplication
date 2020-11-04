package com.car.washing;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.car.washing.model.User;
import com.car.washing.repository.DriverRepository;
import com.car.washing.repository.UserRepository;
import com.car.washing.service.UserService;

@SpringBootApplication
public class carWashingApp{

//	@Autowired
//	private static UserRepository userRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(carWashingApp.class, args);
//		User user = new User() ;
//		user.setCreatedDate(new Date());
//		user.setFullName("mahmoudElhawary");
//		user.setEmail("mahmoudsaeedelhawary@outlook.com");
//		user.setPassword("Aa1122!@");
//		user.setRole("ADMIN");
//		user.setEnabled(true);
//		userRepository.save(user) ; 
	}
	
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true); // you USUALLY want this
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("HEAD");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("DELETE");
		config.addAllowedMethod("PATCH");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}
}
