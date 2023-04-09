public class SimplePizza implements Pizza{
    @Override
    public String getDescription() {
        return "This is a simple pizza";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
