package com.the.world.model;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class World {
    public void start() {
        // make 3 com.the.world.nation
        this.generateNations();

        // com.the.world.nation war random percentage by percentage Factory
        //this.percentageFight();

    }

    @Scheduled(cron = "0/1 * * * * *")
    private void percentageFight() {
        double rand = Math.random();
        System.out.println("rand : " + rand);
        if (rand > 0.5) {
            System.out.println("fight!");
        }
    }

    private void generateNations() {
        Nation korea = Nation.builder().name("korea").territory(
                Territory.builder().x(-120).y(0).width(50).height(70).build()
        ).build();

        Nation china = Nation.builder().name("china").territory(
                Territory.builder().x(0).y(0).width(300).height(280).build()
        ).build();

        Nation japan = Nation.builder().name("japan").territory(
                Territory.builder().x(120).y(-20).width(80).height(120).build()
        ).build();
    }
}
