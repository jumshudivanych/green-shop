package com.jumshudivanych.greenshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /*
    @Autowired
    private DataSource dataSource;
    */
    /*
    @Autowired
    private UserService userService;
    */

    /*
    @Autowired
    private PasswordEncoder passwordEncoder;
    */
    /*
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder(8);
    }
    */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

                .authorizeRequests()
                .antMatchers("/", "/home", "/item1", "/item2", "/item3", "/item4", "/item5", "/item6",  "/login", "/basket/**", "/order", "/product/**", "img/**", "/css/**", "/static/**", "/images/**").permitAll()
                .antMatchers(HttpMethod.POST, "/", "/home", "/login", "/basket", "/order", "/product", "/storage/**").permitAll()
                .antMatchers(HttpMethod.PUT, "/storage/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));;


    }

    // @Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    //  auth.userDetailsService(userService)
    //    .passwordEncoder(NoOpPasswordEncoder.getInstance());
        /*
        auth.jdbcAuthentication()
           .dataSource(dataSource)
           .passwordEncoder(NoOpPasswordEncoder.getInstance())
           .usersByUsernameQuery("select username, password, active from usr where username=?")
           .authoritiesByUsernameQuery("select u.username, ur.roles from usr u inner join user_role ur on u.id= ur.user_id where u.username=?");
        */
    // }
    /*
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSevice)
                .passwordEncoder(passwordEncoder);
    }
    */

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("admin1")
                        .password("xMsGL2$YznEC")
                        .roles("ADMIN")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }


}

