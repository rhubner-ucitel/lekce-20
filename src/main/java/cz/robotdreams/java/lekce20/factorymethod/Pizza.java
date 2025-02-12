package cz.robotdreams.java.lekce20.factorymethod;

public class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("preparing pizza : " + name);
    }
    public void bake() {
    }
    public void cut() {
    }
    public void box() {}

}
