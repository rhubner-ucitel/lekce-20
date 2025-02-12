package cz.robotdreams.java.lekce20.factorymethod;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testSourdough() {
        PizzaFactory factory = new SourdoughPizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza p = store.orderPizza("cheese");

        assertThat(p).isNotNull();

    }

    @Test
    public void testSimple() {
        PizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza p = store.orderPizza("cheese");

        assertThat(p).isNotNull();

    }



}
