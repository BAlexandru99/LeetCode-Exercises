package LeetCode.DesignPatterns.Builder1;

public class Main {
    Pizza myPizza = new Pizza.Builder()
            .cheese(false)
            .salami("chorizo")
            .mushroom(MushroomType.PORCINI)
            .build();
    
    Pizza mariaPizza = new Pizza.Builder()
            .tomato(true)
            .mushroom(MushroomType.CHAMPIGNONS)
            .salami("Pepperoni")
            .cheese(true)
            .build();

    Pizza antoniaPizza = new Pizza.Builder()
            .ham("Prosciutto")
            .tomato(false)
            .cheese(true)
            .mushroom(MushroomType.SHIITAKE)
            .build();
}
