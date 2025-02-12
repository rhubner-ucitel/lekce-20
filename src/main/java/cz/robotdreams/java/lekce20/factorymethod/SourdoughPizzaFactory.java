package cz.robotdreams.java.lekce20.factorymethod;

public class SourdoughPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(String pizza) {
        switch (pizza) {
            case "Peperoni":
                return new PeperoniPizza("Sourdough");
            case "cheese":
                return new CheesePizza("Sourdough");
            default:
                throw new IllegalArgumentException("Unknown pizza: " + pizza);

        }

    }
}
