package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class BuilderExampleTest {
    @Test
    public void simpleBuilder() {
        StringBuilder builder = new StringBuilder();


        builder.append("Ahoj")
                .append("\n")
                .append(10)
                .append(10.5)
                .append("Text");

        String result = builder.toString(); //String builder pouziva toString, ne build().

        assertThat(result).contains("Ahoj") //AssertJ pouziva teke builder pattern.
                .contains("Text")
                .contains("10");
    }
}