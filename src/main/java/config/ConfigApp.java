package config;

import main.Clienti;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    Clienti cliente1(){
        Clienti cliente = new Clienti();
        cliente.setNome("Nicola");

        return cliente;
    }
}
