package me.yling.w5challengeroboresume0825;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http    .authorizeRequests()
                .antMatchers("/","/listresume","/contact/**","/css/**","/images/**","/js/**").permitAll()
//                .antMatchers("/addedu","/addexp", "/addperson","/addski","/index","/result","/resultedu","/resultexp","/resultski").access("hasRole('ROLE_ADMIN')")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure (AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication().
                withUser("admin").password("password").roles("ADMIN");
    }



}
