package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.AppConfig;
import peaksoft.model.Animal;
import peaksoft.model.AnimalsCage;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

public class App {

    public static void main(String[] args) {


        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {

            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }


//        AnimalsCage animal = applicationContext.getBean("animalsCage",AnimalsCage.class);
//        animal.whatAnimalSay();
//
//        AnimalsCage animalsCagetime = applicationContext.getBean("getTime",AnimalsCage.class);
//        animalsCagetime.getTimer();
//
//        System.out.println("animal");
    }


}
