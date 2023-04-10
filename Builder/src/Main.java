public class Main {
    public static void main(String[] args) {
        MakePizza chickenPizza = new PizzaType();
        PizzaChef pizzaChef = new PizzaChef(chickenPizza);

        pizzaChef.makeChickenPizza();

        Pizza pizza = pizzaChef.getPizza();

        System.out.println("Pizza is ready....");
        System.out.println("Pizza dough is - "+pizza.getPizzaDough());
        System.out.println("Pizza meat is - "+pizza.getPizzaMeat());
        System.out.println("Pizza sauce is - "+pizza.getPizzaSauce());
        System.out.println("Pizza toppings is - "+pizza.getPizzaToppings());
        System.out.println("Enjoy your pizza!!");

    }
}