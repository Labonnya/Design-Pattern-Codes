public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "This is a plain pizza";
    }

    @Override
    public double getCost() {
        return 20.00;
    }
}
