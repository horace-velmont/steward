package com.the.world.manager;

import com.the.world.model.World;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NationManager {

    @Scheduled(cron = "0/1 * * * * *")
    public void fight() {
        World world = new World();
        world.start();
    }
}
