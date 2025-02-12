package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

public class DecoratorTest {

    @Test
    public void testDecorator() throws IOException {
        try(
                OutputStream fout = new FileOutputStream("target/out.gz");
                // BufferedOutputStream - je poze dekoratorem, zabaluje puvodni stream, pridava buffer efektivni zapis,
                //                        ale stale se jedna o output strem. Jak vidite, kazdou instanci muzu priradit do
                //                        referencni promenne OutputStream. Dekorator je potomkem OutputStream
                OutputStream bout = new BufferedOutputStream(fout);
                OutputStream gout = new GZIPOutputStream(bout);

                ) {
            gout.write("Ahoj gzip stream".getBytes(StandardCharsets.UTF_8));
        }
    }




}
