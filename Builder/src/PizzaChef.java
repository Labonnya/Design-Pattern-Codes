public class PizzaChef {
    MakePizza chickenPizza;

    public PizzaChef(MakePizza chickenPizza){
        this.chickenPizza = chickenPizza;
    }

    public Pizza getPizza(){
        return this.chickenPizza.getPizza();
    }

    public void makeChickenPizza(){
        chickenPizza.choosePizzaDough();
        chickenPizza.choosePizzaMeat();
        chickenPizza.choosePizzaSauce();
        chickenPizza.choosePizzaToppings();
    }
}
