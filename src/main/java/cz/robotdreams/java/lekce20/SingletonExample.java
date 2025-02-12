package cz.robotdreams.java.lekce20;

public class SingletonExample {

    private static final SingletonExample INSTANCE = new SingletonExample();

    static {
        // Alternativni innicializace pokud potrebujeme
        // pred vytvorenim instance spustit kod
        //INSTANCE = new Singleton()
    }

    private SingletonExample() {
    }

    public String sayHiWithId() {
        return "Hello World! " + this.hashCode(); //Hash code ve vychozim pripade vraci neco jako adresu.
    }

    public SingletonExample getInstance() {
        return INSTANCE;
    }

}
