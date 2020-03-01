package assignment6;
import java.util.*;

public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> rating;

    public Mreview(){};

    public Mreview(String title) {
        this.title = title;
    }

    public Mreview(String title, int rating) {
        this.title = title;
        this.rating = new ArrayList<Integer>();
    }


    public void addRating(int r) {
        rating.add(r);

    }

    public double avgRating() {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < rating.size(); i++) {
            sum += rating.get(i);
        }
        avg = sum / rating.size();
        return avg;
    }

    @Override
    public int compareTo(Mreview m) {
        return (this.title).compareTo(m.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return false;
    }


    public String getTitle() {
        return this.title;
    }


    public int numRating() {
        return rating.size();
    }


    public String toString() {
        if (rating.size() == 0) {
            return "There is no rating about the movie " + getTitle() + "\n";
        }
        return "The average rating of the movie " + "<" + getTitle() + "> is " + avgRating();
    }


    public static void main(String[] args) {
        Mreview test1 = new Mreview("Kill Bill", 3);
            test1.addRating(4);
            test1.addRating(3);
            System.out.println(test1.toString());
    }
}
