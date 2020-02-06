package assignment4;

public class DessertShoppe {
    static double taxRate = 10.0; // the taxRate of WA
    static String storeName = "M & M Dessert Shoppe";
    static int maxSizeOfItemName = 20;
    static int space = 12; //The space between the item name and the item cost.

    /**This method is to return the String
     * formatted in dollar and cent
     * */

    public static String cents2dollorsAndCents(int x) {
        double result = x / 100.0;
        return String.valueOf(result);
    }


    /** This method is to make the items and
     * their costs in the same column
     * */

    public static String receipt(String name, String price) {
        int itemSize = name.length();
        int remainOfName = itemSize % maxSizeOfItemName;
        int rowOfName = itemSize / maxSizeOfItemName;
        if (remainOfName != 0) {
            rowOfName++;
        }
        int start = 0;
        String printReceipt = "";
        for (int i = 1; i < rowOfName; i++) {
            printReceipt += name.substring(start, maxSizeOfItemName * i) + "\n";
            start += maxSizeOfItemName;
        }
        printReceipt += name.substring(start, name.length());

        int costLocation;
        if (maxSizeOfItemName == itemSize) {
            costLocation = space;
        } else {
            costLocation = maxSizeOfItemName - remainOfName + space;
        }
        String add = "";
        for (int i = 0; i < costLocation; i++) {
            add += " ";
        }
        return printReceipt + add + price;
    }

    /**This method is to make the shop name in
     * the middle of the receipt
     * */

    public static String titleLocation (String titleName) {
        int titleSize = titleName.length();
        int spaceBefore = (maxSizeOfItemName + space - titleSize) / 2;
        String title = "";
        for (int i = 0; i < spaceBefore; i++){
            title += " ";
        }
        return title + titleName;
    }
}
