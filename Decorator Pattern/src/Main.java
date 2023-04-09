import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozarella(new SimplePizza()));
        System.out.println("Pizza 0: "+"\n");
        System.out.println(pizza.getDescription());
        System.out.println("Price is " +pizza.getCost());

        System.out.println("\nPizza 1: "+"\n");

        Pizza pizza1 = new Mozarella(new TomatoSauce(new SimplePizza()));
        System.out.println(pizza1.getDescription());
        System.out.println("Cost: "+pizza1.getCost());

        System.out.println("\nPizza 2: "+"\n");

        Pizza pizza2 = new Mozarella(new SimplePizza());
        System.out.println(pizza2.getDescription());
        System.out.println("Cost: "+pizza2.getCost());

        System.out.println("\nPizza 3: ");
        Pizza pizza3 = new Mozarella(new TomatoSauce(new PlainPizza()));
        System.out.println(pizza3.getDescription());
        System.out.println("Cost is: :" +pizza3.getCost());
    }
}