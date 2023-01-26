package main;

import config.ConfigApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        Clienti cliente = context.getBean(Clienti.class);
        System.out.println(cliente.getNome());

        context.close();
    }
}
