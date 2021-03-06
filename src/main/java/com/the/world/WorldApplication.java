package com.the.world;

import com.the.world.core.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WorldApplication {
    public static void main(String[] args) {
        Game game = new Game();
        //game.start();
        SpringApplication.run(WorldApplication.class, args);
    }
}
