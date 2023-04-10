public class PizzaType implements MakePizza{

    Pizza pizza;

    public PizzaType(){
        pizza=new Pizza();
    }
    @Override
    public void choosePizzaDough() {
        pizza.setPizzaDough("Thin Crust");
    }

    @Override
    public void choosePizzaMeat() {
        pizza.setPizzaMeat("Chicken");
    }

    @Override
    public void choosePizzaSauce() {
        pizza.setPizzaSauce("Tomato");
    }

    @Override
    public void choosePizzaToppings() {
        pizza.setPizzaToppings("Olive, Mushroom");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
