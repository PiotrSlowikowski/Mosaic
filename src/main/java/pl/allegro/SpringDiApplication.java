package pl.allegro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        context.close();

    }

}
