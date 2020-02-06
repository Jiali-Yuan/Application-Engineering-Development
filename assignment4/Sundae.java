package assignment4;

public class Sundae extends IceCream {
    String name;
    String topName;
    int topping;
    int cost;

    public Sundae () {

    }
    public Sundae (String name, int cost, String topName, int topping ){
        this.name = name;
        this.cost = cost;
        this.topName = topName;
        this.topping = topping;
    }
    @Override
    protected int getCost() {
        return (int)(cost + topping);
    }

    public String toString() {
        String textInfo = DessertShoppe.receipt(this.name + " " + this.topName, DessertShoppe.cents2dollorsAndCents(this.getCost())) + "\n";
        String numInfo = DessertShoppe.cents2dollorsAndCents(this.cost) + " " + DessertShoppe.cents2dollorsAndCents(this.topping);
        return textInfo + numInfo;
    }
}
