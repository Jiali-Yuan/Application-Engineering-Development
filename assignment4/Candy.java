package assignment4;

public class Candy extends DessertItem {
    String name;
    double weight;
    int price;
    public Candy (String name, double weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
     }
    @Override
    protected int getCost () {
        double cost = Math.round(weight * price);
        return (int)cost;
    }

    public String toString() {
        String textInfo = DessertShoppe.receipt(this.name, DessertShoppe.cents2dollorsAndCents(this.getCost())) + "\n";
        String numInfo = this.weight + "lbs. @ " + DessertShoppe.cents2dollorsAndCents(this.price) + "/lb.";
        return textInfo + numInfo;
    }
}
