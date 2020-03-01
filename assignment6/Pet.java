package assignment6;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected Integer sex;
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public Pet(String name, String ownerName, String color) {
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getColor() {
        return this.color;
    }

    public void setSex(int sexId) {
        this.sex = sexId;
    }

    public String getSex() {
        switch(this.sex) {
            case 1 : return "MALE";
            case 2 : return "FEMALE";
            case 3 : return "SPAYED";
            case 4 : return "NEUTERED";
            default : return "Unknown";
        }
    }

    public String toString() {
        return "The pet name is " + getPetName() + "\n" + "The color is " + getColor() + "\n" + "The gender is " + getSex() + "\n" + "The owner name is " + getOwnerName();
    }

    public static void main(String[] args) {
        Pet test = new Pet("Spot", "Mary", "Black and White");
        test.setSex(1);
        System.out.println(test);
    }
}
