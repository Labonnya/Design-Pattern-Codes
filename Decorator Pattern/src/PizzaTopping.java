public abstract class PizzaTopping implements Pizza{

    public Pizza pizza;

    public PizzaTopping(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
