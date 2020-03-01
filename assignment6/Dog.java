package assignment6;
import java.util.Calendar;

public class Dog extends Pet implements Boardable{
    private String size;
    int startD;
    int startM;
    int startY;
    int endD, endM, endY;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public String toString() {
        return getClass().getName() + " : " + super.toString() + "\n" + "Size: " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        startM= month;
        startD = day;
        startY = year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        endM = month;
        endD = day;
        endY = year;
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Calendar cur = Calendar.getInstance();
        cur.set(year, month, day);
        Calendar s = Calendar.getInstance();
        s.set(startY, startM, startD);
        Calendar e = Calendar.getInstance();
        e.set(endY, endM, endD);
        if (cur.before(s) || e.before(cur)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Dog test = new Dog("Spot","Susan", "white", "medium");
        test.setSex(3);
        test.setBoardStart(9, 23, 2015);
        test.setBoardEnd(7, 12, 2017);
        boolean test1 = test.boarding(9, 23, 2019);
        System.out.println(test);
        if (test1 == true) {
            System.out.println("The given date is between start and end dates.");
        }else {
            System.out.println("The given date is out of the start and end dates.");
        }
    }
}
