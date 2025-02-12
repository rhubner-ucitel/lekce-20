package cz.robotdreams.java.lekce20.factorymethod;

public class SimplePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String pizza) {
        switch (pizza) {
            case "Peperoni":
                return new PeperoniPizza("Simple");
            case "cheese":
                return new CheesePizza("Simple");
            default:
                throw new IllegalArgumentException("Unknown pizza: " + pizza);

        }
    }
}
