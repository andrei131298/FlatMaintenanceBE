package blocks.maintenance.security;//package com.flatmaintenanceBE.security;
//
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@AllArgsConstructor
//public class SecurityConfig {
//
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        "/hello/*/admin" cu id
//        http.authorizeHttpRequests().requestMatchers("/").permitAll()
//                .and().
//        authorizeHttpRequests().requestMatchers("/h2-console/**").permitAll()
//                .and()
//                .headers().frameOptions().disable()
//                .and()
//                .csrf().ignoringRequestMatchers("/h2-console/**")
//                .and()
//                .cors().disable();
//       return http.build();
//    }
//
////    @Bean
////    public UserDetailsService users(){
////        UserDetails admin = User.builder().username("admin").password(passwordEncoder.encode("admin-pass")).roles("ADMIN").build();
////        UserDetails user = User.builder().username("user").password(passwordEncoder.encode("user-pass")).roles("USER").build();
////
////        return new InMemoryUserDetailsManager(admin, user);
////    }
//}
