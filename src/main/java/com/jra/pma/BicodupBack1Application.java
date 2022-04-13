package com.jra.pma;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jra.pma.models.Role;
import com.jra.pma.models.User;
import com.jra.pma.models.UserRole;
import com.jra.pma.services.UserService;
import com.jra.pma.services.Impl.UserServiceImpl;

@SpringBootApplication
public class BicodupBack1Application implements  CommandLineRunner{
	@Autowired
	private UserServiceImpl userService ;

	public static void main(String[] args) {
		SpringApplication.run(BicodupBack1Application.class, args);
		 
	
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/").allowedOrigins("http://localhost:4200");
			}
		};
	}


	
	
	
	/*@Bean 
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter();
	}*/

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("start coding");
		
		
		
		/*Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRolename("Admin");
		User user=new User();
		
		user.setFirstname("eya");
		user.setLastname("TAYARI");
		user.setUsername("eya98");
		user.setPassword("12345");
		user.setEmail("eya.tayari@gmail.com");
		user.setProfile("default.png");
		user.setUsername("eya98");
		Set<UserRole> userRoleSet= new HashSet<>();
		
		UserRole userRole =new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		user.setUsername("eya987");

		User user1 = this.userService.CreateUser(user, userRoleSet);
		System.out.println(user1.getUserroles().toString());*/
	}

}
