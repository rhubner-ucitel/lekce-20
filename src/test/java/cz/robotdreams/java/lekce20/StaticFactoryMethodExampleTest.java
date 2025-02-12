package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StaticFactoryMethodExampleTest {

    @Test
    public void testInstance() {
        StaticFactoryMethodExample example = StaticFactoryMethodExample.create("Some name - 12345");
        assertThat(example.getInternalName()).isEqualTo("Some name - 12345");
    }

    @Test
    public void throwError() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
                () -> StaticFactoryMethodExample.create("Some name")
        ).withMessage("Invalid internal name");
    }

    @Test
    public void twoImplementaitons() {
        StaticFactoryMethodExample example = StaticFactoryMethodExample.create("Some name - 12345");
        assertThat(example).isExactlyInstanceOf(StaticFactoryMethodExample.class);

        StaticFactoryMethodExample example2 = StaticFactoryMethodExample.create("SuperTrida");
        assertThat(example2).isExactlyInstanceOf(StaticFactoryMethodExample.class);

    }






}
