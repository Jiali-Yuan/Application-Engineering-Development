package assignment4;
import java.util.ArrayList;

public class Checkout {
    ArrayList<DessertItem> listOfItem = new ArrayList<>();
    public ArrayList enterItem (DessertItem item) {
        listOfItem.add(item);
        return listOfItem;
    }

    public Checkout(){

    }

    public int numberOfItems () {
        return listOfItem.size();
    }

    public int totalCost () {
        int costBefore = 0;
        for (DessertItem dI : listOfItem){
            costBefore += dI.getCost();
        }
        return costBefore;
    }

    public int totalTax () {
        double tTax = 0;
         for (DessertItem dI : listOfItem) {
             tTax += dI.getCost() * (DessertShoppe.taxRate / 100);
         }
        return (int)tTax;
    }

    public String toString () {
        String receipt = DessertShoppe.titleLocation(DessertShoppe.storeName) + "\n" + DessertShoppe.titleLocation("--------------------") + "\n\n";
        for (DessertItem  list : listOfItem) {
            receipt += list.toString() + "\n";
        }
        receipt += "\n" + DessertShoppe.receipt("Tax", DessertShoppe.cents2dollorsAndCents(totalTax()) + "\n") + DessertShoppe.receipt("Total Cost", DessertShoppe.cents2dollorsAndCents(totalCost() + totalTax()) + "\n");
        String back = DessertShoppe.titleLocation("--------------------") + "\n" + DessertShoppe.titleLocation("Welcome back!");
        return receipt + back;
    }

    public void clear() {
        listOfItem.clear();
    }
}
