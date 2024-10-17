package LeetCode.DesignPatterns.Builder1;

public class Pizza {
    private boolean tomato;
    private MushroomType mushroom;
    private String salami;
    private String ham;
    private boolean cheese;

    public static class Builder{
        private Pizza pizza = new Pizza();

        public Builder tomato(boolean tomato){
            pizza.tomato = tomato;
            return this;
        }

        public Builder mushroom(MushroomType mushroom){
            pizza.mushroom = mushroom;
            return this;
        }

        public Builder salami(String salami){
            pizza.salami = salami;
            return this;
        }

        public Builder ham(String ham){
            pizza.ham = ham;
            return this;
        }

        public Builder cheese(boolean cheese){
            pizza.cheese = cheese;
            return this;
        }
        public Pizza build(){
            return pizza;
        }


    }
    
}
