//package com.example.Spring_boot_95_AllConcept.Crud_JPA_JSP_Pages;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfigue {
//
//	
//				
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//		
//		http.authorizeRequests()
//			.antMatchers("/list").permitAll()
////			.antMatchers("/add_product","/saveProduct","/update/**").hasRole("User")
////			.antMatchers("/delete/**").hasRole("Admin")
//			.anyRequest()
//			.authenticated()
//			.and()
//			.csrf().disable()
//			.formLogin();
//		return http.build();
//	}
//	
//	@Bean
//	public InMemoryUserDetailsManager detailsManager(org.springframework.security.crypto.password.PasswordEncoder passwordEnocder) {
//			
//			UserDetails user1=User.withUsername("Sourabhs")
//					.password(passwordEnocder.encode("Sourabh@45"))
//					.roles("User")
//					.build();
//			
//			UserDetails admin1=User.withUsername("Rohit")
//					.password(passwordEnocder.encode("Rohit@45"))
//					.roles("Admin").build();
//			return new InMemoryUserDetailsManager(user1,admin1);
//	}
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//}
