package cz.robotdreams.java.lekce20;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterExampleTest {

    private static final byte[] DATA = new byte[] {0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38};

    @Test
    public void adapterExample() throws IOException {
        InputStream in = new ByteArrayInputStream(DATA);

        // Pouzivame adapter InputStreamReader na konverzi z jednoho typu na jiny typ.
        // Adapter vetsinu volani deleguje a co nejde delegoat, zkonvertuje.
        Reader reader = new InputStreamReader(in, "UTF-8");


        // === zbytek testu
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();
        assertThat(line).isEqualTo("012345678");

    }

}
