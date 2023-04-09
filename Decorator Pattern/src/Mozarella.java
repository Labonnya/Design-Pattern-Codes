public class Mozarella extends PizzaTopping{

    public Mozarella(Pizza pizza) {
        super(pizza);
        //System.out.println("Adding Mozarella");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+"  with Mozarella";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+10.00;
    }
}
