package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;

@Configuration
public class MainConfiguration {

    @Bean
    public Klocki klocki() {
        return new Klocki();
    }

    @Bean
    public Dziecko jas(@Qualifier ("klocki") Zabawka zabawka) {
        Dziecko jas = new Jas(zabawka);
        jas.odpakuj();
        return jas;
    }


    @Bean
    public Mis mis () {
        return new Mis();
    }
    @Bean
    public Dziecko malgosia(@Qualifier ("mis") Zabawka zabawka) {
        Dziecko malgosia = new Malgosia(zabawka);
        malgosia.odpakuj();
        return malgosia;
    }
     @ Bean
     public Samochodzik samochodzik () {
        return new Samochodzik();
     }
    @Bean
    public Dziecko grzes(@Qualifier ("samochodzik") Zabawka zabawka ) {
        Dziecko grzes = new Grzes(zabawka);
        grzes.odpakuj();
        return grzes;
    }

}
