package assignment4;

public abstract class DessertItem {
    String name;

    public DessertItem (){

    }

    public DessertItem (String name) {
        this.name = name;
    }

    public final String getName () {
        return this.name;
    }

    abstract int getCost ();
}
