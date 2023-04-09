public class TomatoSauce extends PizzaTopping{
    public TomatoSauce(Pizza pizza) {
        super(pizza);
        //System.out.println("Adding sauce");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+"  with Tomato Sauce";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+5.00;
    }
}
