package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Assertions.*;


/**
 * Pouziti Observer a Observable z JDK je zde pouze pro zjednodusseni vyuky.
 * Tyto tridy jsou depraceted a ve svych programe je nepouzivejte.
 * Nicmene navrhovy vzor je porad platny a nic Vam nebrani si ho implementovat
 * pomoci vlastnich trid a rozhrani.
 */
public class ObserverTest {

    private static class Tlacitko extends Observable {
        public void click() {
            setChanged();
            notifyObservers("Hello World");
        }

    }

    @Test
    public void observerTest() {
        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer updated with argumet :  " + arg);
            }
        };

        AtomicReference<String> reference = new AtomicReference<>();


        Observer observer2 = (o, arg) -> System.out.println("Observer2 lambda updated with argumet :  " + arg);
        Observer observer3 = (o, arg) -> reference.set((String)arg);

        Tlacitko tlacitko = new Tlacitko();

        tlacitko.addObserver(observer);
        tlacitko.addObserver(observer2);
        tlacitko.addObserver(observer3);

        tlacitko.click(); //Simulace kliknuti

        assertThat(reference.get()).isEqualTo("Hello World");

    }
}
