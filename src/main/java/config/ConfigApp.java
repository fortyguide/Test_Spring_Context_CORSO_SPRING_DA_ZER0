package config;

import main.Clienti;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ConfigApp {

    /*
    @Bean
    @Primary
    Clienti cliente1(){
        Clienti cliente = new Clienti();
        cliente.setNome("Nicola");

        return cliente;
    }

    @Bean(name = "Cliente2")
    Clienti cliente2(){
        Clienti cliente = new Clienti();
        cliente.setNome("Marco");

        return cliente;
    }
    */
}
