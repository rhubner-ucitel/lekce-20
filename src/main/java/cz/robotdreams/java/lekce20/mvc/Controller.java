package cz.robotdreams.java.lekce20.mvc;

import java.util.Map;
import java.util.Scanner;

public class Controller {

    private UzivatelView uzivatelView;
    // Pristum do DB pres DAO.


    public Controller(UzivatelView uzivatelView) {
        this.uzivatelView = uzivatelView;
    }

    //@Get("/search") ${header}
    //                ${Uzivatel.jmeno} -> uzivatel.getJmeno()
//    public String zpracujPozadavek(Map<String, Object> model, String queryParameter) {
//        ///dotaz do DB
//        if( test zda mame data ){
//            model.put("header", "Vysledek vyhledavani");
//            model.put("Uzivatel", new Uzivatel("Jan", "Novak"));
//            return "zobrazDetail";
//        } else {
//            return "redirect:notFound";
//        }
//    }


    public void zpracujPozadavek() {
        Scanner c = new Scanner(System.in);
        System.out.println("zadej jmeno : ");
        String jmeno = c.next();
        System.out.println("Zadej prijmeni : ");
        String prijmeni = c.next();

        Uzivatel u = new Uzivatel(jmeno, prijmeni);

        uzivatelView.zobrazUzivatele(u);

        uzivatelView.ulozUzivateleDoSouboru(u);

    }

    public static void main(String[] args) {
        UzivatelView uzivatelView = new UzivatelView();
        Controller controller = new Controller(uzivatelView);
        controller.zpracujPozadavek();
    }

}
