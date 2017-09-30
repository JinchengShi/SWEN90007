package com.hrs.config;

import com.hrs.security.CustomAccessDeniedHandler;
import com.hrs.security.CustomLogoutSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
//@ImportResource({ "classpath:webSecurityConfig.xml" })
@EnableWebSecurity
@Profile("!https")
public class SecSecurityConfig extends WebSecurityConfigurerAdapter {

 public SecSecurityConfig() {
     super();
 }

 @Override
 protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
     // @formatter:off
     auth.inMemoryAuthentication()
     .withUser("user1").password("user1Pass").roles("JOBSEEKER")
     .and()
     .withUser("user2").password("user2Pass").roles("JOBSEEKER")
     .and()
     .withUser("admin").password("adminPass").roles("ADVISOR");
     // @formatter:on
 }

 @Override
 protected void configure(final HttpSecurity http) throws Exception {
     // @formatter:off
     http
     .csrf().disable()
     .authorizeRequests()
     .antMatchers("/advisor/**").hasRole("ADVISOR")
     .antMatchers("/jobseeker/**").hasRole("JOBSEEKER")
     .antMatchers("/anonymous*").anonymous()
     .antMatchers("/login*").permitAll()
     .anyRequest().authenticated()
     .and()
     .formLogin()
     .loginPage("/login.html")
     .loginProcessingUrl("/perform_login")
     .defaultSuccessUrl("/homepage.html",true)
     .failureUrl("/login.html?error=true")
     .and()
     .logout()
     .logoutUrl("/perform_logout")
     .deleteCookies("JSESSIONID")
     .logoutSuccessHandler(logoutSuccessHandler());
     //.and()
     //.exceptionHandling().accessDeniedPage("/accessDenied");
     //.exceptionHandling().accessDeniedHandler(accessDeniedHandler());
     // @formatter:on
 }

 @Bean
 public LogoutSuccessHandler logoutSuccessHandler() {
     return new CustomLogoutSuccessHandler();
 }

 @Bean
 public AccessDeniedHandler accessDeniedHandler() {
     return new CustomAccessDeniedHandler();
 }

}