package assignment4;

public class IceCream extends DessertItem {
    String name;
    int cost;

    public IceCream () {

    }
    public IceCream (String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    protected int getCost() {
        return (int)cost;
    }

    public String toString() {
        String textInfo = DessertShoppe.receipt(this.name, DessertShoppe.cents2dollorsAndCents(this.getCost())) + "\n";
        String numInfo = DessertShoppe.cents2dollorsAndCents(this.cost) + " ";
        return textInfo + numInfo;
    }
}
