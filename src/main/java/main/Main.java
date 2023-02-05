package main;

import config.ConfigApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        Clienti cliente1 = context.getBean(Clienti.class);
        cliente1.setNome("Nicola");
        System.out.println(cliente1.getNome());
        /*
        Clienti cliente1 = context.getBean("Cliente1", Clienti.class);
        System.out.println(cliente1.getNome());

        Clienti cliente2 = context.getBean("Cliente2", Clienti.class);
        System.out.println(cliente2.getNome());

        context.close();
        */
    }
}
