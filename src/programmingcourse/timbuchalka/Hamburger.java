package programmingcourse.timbuchalka;

public class Hamburger {
    private String name;
    private String breadRollType;
    private double price;
    private String meat;


    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String breadRollType, double price, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;

    }

    public void addHamburgerAddition1 (String addition, double price) {
        this.addition1Name=addition;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2 (String addition, double price) {
        this.addition2Name=addition;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3 (String addition, double price) {
        this.addition3Name=addition;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4 (String addition, double price) {
        this.addition4Name=addition;
        this.addition4Price=price;
    }
    public double itemizeHamburger () {
        double sum = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + "price is " + this.price);
        if (this.addition1Name != null) {
            sum += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            sum += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            sum += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            sum += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return sum;
    }
}
