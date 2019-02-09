package pl.edu.wszib.springhelloworld;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.Glos;
import pl.edu.wszib.springhelloworld.model.KartaDoGlosowania;
import pl.edu.wszib.springhelloworld.model.Urna;
import pl.edu.wszib.springhelloworld.model.Wyborca;

import java.io.UnsupportedEncodingException;

@Configuration
public class MyConfiguration {

    /*@Bean
    @Scope("prototype")
    public Glos glos (){
    return glos() ;
    }*/

    @Bean
    @Scope("prototype")
    public KartaDoGlosowania kartaDoGlosowania() {
        return new KartaDoGlosowania();
    }

    @Bean
    public Urna urna() {
        return new Urna();
    }


    @Bean
    public Wyborca szymon () {
        return new Wyborca(kartaDoGlosowania());
    }

    @Bean
    public Wyborca lukasz () {
        return new Wyborca(kartaDoGlosowania());
    }

    @Bean
    public Wyborca magda () {
        return new Wyborca(kartaDoGlosowania());
    }

        @Bean
    public String execute (Wyborca szymon, Wyborca lukasz, Wyborca magda, Urna urna){
        szymon.oddajGlos(urna);
        lukasz.oddajGlos(urna);
        magda.oddajGlos(urna);
        urna.zlicz();
        return "";
        }

}
