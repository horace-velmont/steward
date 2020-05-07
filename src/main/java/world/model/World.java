package world.model;


import nation.model.Nation;
import territory.model.Territory;

public class World {
    public void start() {
        // make 3 nation
        this.generateNations();

        // nation war random percentage by percentage Factory
        this.percentageFight();

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
