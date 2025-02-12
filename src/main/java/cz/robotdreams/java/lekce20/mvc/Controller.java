package cz.robotdreams.java.lekce20.mvc;

import java.util.Scanner;

public class Controller {

    private UzivatelView uzivatelView;

    public Controller(UzivatelView uzivatelView) {
        this.uzivatelView = uzivatelView;
    }

    public void zpracujPozadavek() {
        Scanner c = new Scanner(System.in);
        System.out.println("zadej jmeno : ");
        String jmeno = c.next();
        System.out.println("Zadej prijmeni : ");
        String prijmeni = c.next();

        Uzivatel u = new Uzivatel(jmeno, prijmeni);

        uzivatelView.zobrazUzivatele(u);

        //uzivatelView.ulozUzivateleDoSouboru(u);

    }

    public static void main(String[] args) {
        UzivatelView uzivatelView = new UzivatelView();
        Controller controller = new Controller(uzivatelView);
        controller.zpracujPozadavek();
    }

}
