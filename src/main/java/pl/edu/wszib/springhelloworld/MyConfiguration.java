package pl.edu.wszib.springhelloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;
import org.springframework.context.ApplicationContext;


@Configuration
public class MyConfiguration implements ApplicationContextAware {

   /* @Bean
    public Tygrys tygrys () {
        return new Tygrys();
    }

    @Bean
    public String execute (Kot kot) {
        kot.glos();
        return "";
    }*/
    @Bean
    public Drzwi drzwi (){
        return new Drzwi();
    }

   @Bean
   public Karoseria karoseria (Drzwi drzwi) {
       return new Karoseria(drzwi);
   }
    @Bean
    public Silnik silnik () {
        return new Silnik();
    }

   @Bean
   public SkrzyniaBiegow skrzyniaBiegow () {
        return new SkrzyniaBiegow();
   }

   @Bean
   public UkladSterowania ukladSterowania (Kierownica kierownica){
        return new UkladSterowania(kierownica());
   }

    @Bean
    public Kierownica kierownica () {
        return new Kierownica();
    }
   @Bean
   public Zawieszenie zawieszenie(Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, UkladSterowania ukladSterowania){
        return new Zawieszenie(silnik, skrzyniaBiegow, ukladSterowania);
   }

   @Bean
    public Samochod samochod(Karoseria karoseria, Zawieszenie zawieszenie){
       return new Samochod(karoseria, zawieszenie);

   }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getAutowireCapableBeanFactory().getBean("samochód"));
    }
}



