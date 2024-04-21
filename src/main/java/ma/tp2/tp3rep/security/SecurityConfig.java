package ma.tp2.tp3rep.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("User1").password(passwordEncoder.encode("1234")).roles("USER").build(),
                User.withUsername("User2").password(passwordEncoder.encode("1234")).roles("USER").build(),
                User.withUsername("User3").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()

        );
    }





    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .httpBasic(withDefaults())
                .authorizeRequests(authorize -> authorize
                        .anyRequest().authenticated()
                );
        return httpSecurity.build();
    }
}