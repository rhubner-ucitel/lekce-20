package cz.robotdreams.java.lekce20.mvc;

import java.io.FileWriter;
import java.io.IOException;

public class UzivatelView {

    public void zobrazUzivatele(Uzivatel u) {
        System.out.println("Uzivatel: " + u);
    }

    public void ulozUzivateleDoSouboru(Uzivatel u) {
        try(FileWriter out = new FileWriter("target/uzivatel.txt");) {
            out.write("Uzivatel: " + u);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
