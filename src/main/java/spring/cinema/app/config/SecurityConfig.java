package spring.cinema.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import spring.cinema.app.model.Role;
import spring.cinema.app.service.impl.CustomUserDetailsService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    public static final String ADMIN = Role.RoleName.ADMIN.name();
    public static final String USER = Role.RoleName.USER.name();
    private final CustomUserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(CustomUserDetailsService userDetailsService,
                          PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/register").permitAll()
                .antMatchers(HttpMethod.GET, "/cinema-halls/**").hasAnyRole(ADMIN, USER)
                .antMatchers(HttpMethod.POST, "/cinema-halls/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.GET, "/movies/**").hasAnyRole(ADMIN, USER)
                .antMatchers(HttpMethod.POST, "/movies/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.GET, "/movie-sessions/**").hasAnyRole(ADMIN, USER)
                .antMatchers(HttpMethod.POST, "/movie-sessions/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.GET, "/movie-sessions/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.PUT,"/movie-sessions/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.DELETE, "/movie-sessions/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.GET, "/users/**").hasRole(ADMIN)
                .antMatchers(HttpMethod.GET, "/orders/**").hasRole(USER)
                .antMatchers(HttpMethod.POST, "/orders/**").hasRole(USER)
                .antMatchers(HttpMethod.POST, "/shopping-cart/**").hasRole(USER)
                .antMatchers(HttpMethod.POST, "/shopping-cart/**").hasRole(USER)
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
