package candies;

import candies.config.Config;
import candies.impl.Candy;
import candies.interfaces.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 1. Створіть новий клас із будь-якої предметної області з кількома полями. Деякі поля мають бути задані за допомогою конструктора,
 * деякі – за допомогою setter-методу, а деякі – за допомогою методу init, який ви маєте вказати під час оголошення біну в конфігурації.
 * 2. Переведіть конфігурацію XML із Завдання 2 у конфігурацію Java.
 * 3. За аналогією з List з уроку створіть у конфігурації XML бін Map.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println((char) 27 + "[35m" + "XML Config" + (char) 27 + "[38m");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Product candy1 = context.getBean("candy1", Candy.class);
        System.out.println(candy1);
        Product candy2 = context.getBean("candy2", Candy.class);
        System.out.println(candy2);
        Product candy3 = context.getBean("candy3", Candy.class);
        System.out.println(candy3);

        System.out.println((char) 27 + "[35m" + "\nMap Bean" + (char) 27 + "[38m");
        Map<Integer, Candy> myMap = context.getBean("candyMap", Map.class);
        for (Map.Entry<Integer, Candy> entry : myMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        System.out.println((char) 27 + "[35m" + "\nJava Config" + (char) 27 + "[38m");
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(Config.class);
        Map<String,Candy> candies = contextJava.getBeansOfType(Candy.class);
        for (Candy candy : candies.values())
            System.out.println(candy);
    }
}
