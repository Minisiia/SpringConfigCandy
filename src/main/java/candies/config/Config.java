package candies.config;

import candies.impl.Candy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Candy candy1() {
       Candy candy = new Candy("Slivki-Linivki","waffle");
       candy.setWeight(10);
       candy.setPrice(5.0);
       return candy;
    }

    @Bean
    public Candy candy2() {
        Candy candy = new Candy("Shaleni-Bdzhilky","jelly");
        candy.setWeight(5);
        candy.setPrice(2.0);
        return candy;
    }

    @Bean
    public Candy candy3() {
        Candy candy = new Candy("Mon-Blan","chocolate");
        candy.setWeight(15);
        candy.setPrice(15.0);
        return candy;
    }

}
