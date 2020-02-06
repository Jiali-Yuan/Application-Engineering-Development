package assignment4;

public class Cookie extends DessertItem {
    String name;
    int number;
    int price;
    public Cookie (String name, int number, int price) {
        this.name = name;
        this.number = number;
        this.price = price;
     }
    @Override
    protected int getCost() {
        double cost = Math.round(number / 12.0 * price);
        return (int)cost;
    }

    public String toString() {
        String textInfo = DessertShoppe.receipt(this.name, DessertShoppe.cents2dollorsAndCents(this.getCost())) + "\n";
        String numInfo = this.number + " @ " + DessertShoppe.cents2dollorsAndCents(this.price) + "/dz.";
        return textInfo + numInfo;
    }
}
