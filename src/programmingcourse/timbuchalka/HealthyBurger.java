package programmingcourse.timbuchalka;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price=0;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", "Brown rye roll", price, meat);
       // this.healthyExtra1Price+=price;


    }

    public void addHealthyAddition1 (String addition, double price) {
        this.healthyExtra1Name = addition;
        this.healthyExtra1Price += price;
    }
    public void addHealthyAddition2 (String addition, double price) {
        this.healthyExtra2Name = addition;
        this.healthyExtra2Price += price;
    }

    @Override
    public double itemizeHamburger() {
        double sum = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            sum += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            sum += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return sum;
    }
}
