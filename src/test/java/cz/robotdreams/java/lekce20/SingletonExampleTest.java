package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SingletonExampleTest {

    @Test
    public void simpleTest() {
        SingletonExample example = SingletonExample.getInstance();
        System.out.println(example.sayHiWithId());

        SingletonExample example2 = SingletonExample.getInstance();
        System.out.println(example2.sayHiWithId());

        assertThat(example).isSameAs(example2);


    }


}
